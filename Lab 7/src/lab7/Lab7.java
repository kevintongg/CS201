package lab7;

import java.util.Scanner;

public class Lab7 {

  static final Scanner SC = new Scanner(System.in);

  public static void main(String[] args) {

    double[] myArray = getArray();

    System.out.println();
    currentValues(myArray);
    System.out.println();
    cubed(myArray);
    System.out.println();
    changeValue(myArray);
    System.out.println();
    flip(myArray);
    System.out.println();
    printArray(myArray);

  } // end main

  public static double[] getArray() {

    double[] myArray = new double[10];

    System.out.println("Please enter 10 doubles." + " (Counter starts counting at 0.)");
    for (int i = 0; i < myArray.length; i++) {
      System.out.println("Please enter value #" + (i + 1) + ":");
      while (!SC.hasNextDouble()) {
        SC.nextLine();
        System.out.println("Invalid input. Please enter a double.");
      }
      myArray[i] = SC.nextDouble();
      System.out.println("#" + i + ": " + myArray[i]);
    }

    return myArray;

  } // end getArray

  public static void currentValues(double[] myArray) {

    System.out.println(
        "The values you entered are as follows: (Any value over 100 has been replaced with 100)");
    for (int i = 0; i < myArray.length; i++) {
      System.out.println("#" + i + ": " + myArray[i] + ".");
    }
  } // end currentValues

  public static void cubed(double[] myArray) {

    System.out.println("This part will raise each of your entered values to the third power.");
    for (int i = 0; i < myArray.length; i++) {
      double power = Math.pow(myArray[i], 3);
      System.out.printf("For your #" + i + ", the result for " + myArray[i] + " cubed is: %.3f.\n",
          power);
    }
  } // end cubed

  public static void changeValue(double[] myArray) {

    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] > 100) {
        myArray[i] = 100;
      }
    }

  } // end changeValue

  public static void flip(double[] myArray) {

    double reciprocal;

    System.out.println("This part will take the reciprocal of each number you have entered.");
    for (int i = 0; i < myArray.length; i++) {
      reciprocal = (1.0 / myArray[i]);
      System.out.printf("For your #" + i + ", the reciprocal of " + myArray[i] + " is: %.3f.\n",
          reciprocal);
    }

  } // end flip

  public static void printArray(double[] myArray) {

    System.out.println("Any value entered that is over 100.0 is replaced with 100.0.");
    for (int i = 0; i < myArray.length; i++) {
      System.out.println("For your #" + i + ", the number value is: " + myArray[i] + ".");
    }

  } // end printArray
} // end class