package FinalExam;

import java.util.Scanner;

public class Final {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    long[] myArray;
    myArray = getLongArrayFromInput(0);

    getLongArrayFromInput(10);
    show32BitCount(myArray);
    extractIntArray(myArray);

  }

  public static long[] getLongArrayFromInput(int count) {

    long[] myArray;
    myArray = new long[count];

    for (int i = 0; i < myArray.length; i++) {
      System.out.println("Please enter value #" + (i + 1) + ":");
      while (!sc.hasNextLong()) {
        sc.nextLine();
        System.out.println("Please enter a valid long.");
      }
      myArray[i] = sc.nextLong();
      System.out.println("#" + (i + 1) + ": " + myArray[i]);
    }

    return myArray;
  }

  public static void show32BitCount(long[] myArray) {

    for (int i = 0; i < myArray.length; i++) {
      if (myArray.length < -2147483648 || myArray.length > 2147483647) {
        System.out.println("Array contains " + myArray.length + " long values.");
      }
      if (myArray.length < -2147483648 && myArray.length > 2147483647) {
        System.out.println("Array contains " + myArray.length + " values within int.");
      }
    }
  }

  public static long[] extractIntArray(long[] myArray) {

    long[] change = myArray;

    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] > 2147483647) {
        change[i] = (int) 2147483647;
      } else if (myArray[i] < -2147483648) {
        change[i] = (int) -2147483648;
      }
      System.out.println(myArray[i]);
    }

    System.out.println(change.length);

    return myArray;
  }
}
