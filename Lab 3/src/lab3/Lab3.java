package lab3;

import java.util.Scanner;

public class Lab3 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String hand;
    String height;
    String name;
    int ageInMonths;
    int ageOfFriendInMonths;
    double gpa;
    double displacement;

    // Asks if user is left-handed
    System.out.println("Are you left-handed?");
    hand = input.next().toLowerCase();

    // Asks if user's father was less than 5 ft 8 inches tall
    System.out.println("Is your father less than 5 feet, 8 inches tall?");
    height = input.next().toLowerCase();

    // Asks for user's age in months
    System.out.println("What is your age in months?");
    ageInMonths = input.nextInt();

    // Asks user for a name of a sibling or friend of the user
    System.out.println("Input the name of a sibling or friend.");
    name = input.next();

    // Asks for age in months of said sibling or friend
    System.out.println("What is the age in months of your sibling or friend?");
    ageOfFriendInMonths = input.nextInt();

    // Asks for user's GPA and displays it
    System.out.println("What is your GPA?");
    gpa = input.nextDouble();

    // Asks for the displacement in liters of the user's car engine
    System.out.println("What is the displacement of your car in liters?");
    displacement = input.nextDouble();

    // Is the user left-handed?
    System.out.println("Is the user left-handed?");
    if (hand.equals("yes")) {
      System.out.println("Yes, the user is left-handed.");
    } else {
      System.out.println("No, the user is not left-handed.");
    }

    // Was user's father less than 5 feet, 8 inches tall?
    System.out.println("Was the user's father less than 5 feet, 8 inches tall?");
    if (height.equals("yes")) {
      System.out.println("Yes, the user's father is less than 5 feet, 8 inches tall.");
    } else {
      System.out.println("No, the user's father is not less than 5 feet, 8 inches tall.");
    }

    // Are at least one of the values from hand and height true? (true if either or both are true)
    System.out.println("Are at least one of the values from hand and height true? (true if either or both are true)");
    if ((hand.equals("yes")) || (height.equals("yes"))) {
      System.out.println("Yes.");
    } else {
      System.out.println("No.");
    }

    // Are a and b both true? (false if at least one is false)
    System.out.println("Are a and b both true? (false if at least one is false)");
    if ((hand.equals("yes")) && (height.equals("yes"))) {
      System.out.println("Yes.");
    } else {
      System.out.println("No.");
    }

    // Is the user older than his/her sibling/friend (as far as we can tell from the ages in months.) Show the sibling or friend's name in the output (eg, "Sally is older than you!"
    System.out.println("Is the user older than his/her sibling/friend? Show the sibling's or friend's name in the output.");
    if (ageInMonths > ageOfFriendInMonths) {
      System.out.println(name + " is younger than you!");
    } else {
      System.out.println(name + " is older than you!");
    }

    // Is the user's age in months within 18 months of the age of the sibling/friend? You may want to use Math.abs(), which computes the absolute value of a number, for this.
    System.out.println("Is the user's age in months within 18 months of the age of the sibling/friend?");
    if (Math.abs(ageInMonths + ageOfFriendInMonths) <= 18) {
      System.out.println("Yes, the user's age is within 18 months.");
    } else {
      System.out.println("No, the user's age is not within 18 months.");
    }

    // Is the user's age in months evenly divisible by 6?
    System.out.println("Is the user's age in months evenly divisible by 6?");
    if ((ageInMonths % 6) == 0) {
      System.out.println("Yes, the user's age is evenly divisible by 6.");
    } else {
      System.out.println("No, the user's age is not evenly divisible by 6.");
    }

    // Is the user's GPA at least equal to the displacement in liters of his/her car engine?
    System.out.println("Is the user's GPA at least equal to the displacement in liters of his/her car engine?");
    if (gpa >= displacement) {
      System.out.println("Yes, the user's GPA is at least equal to the displacement of his/her car in liters.");
    } else {
      System.out.println("No, the user's GPA is not at least equal to the displacement of his/her car in liters.");
    }
  }

}
