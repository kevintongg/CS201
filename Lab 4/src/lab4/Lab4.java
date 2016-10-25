package lab4;

import java.util.Scanner;

public class Lab4 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double currentGPA;
    double gradePoints = 4;
    int numOfUnits;
    int CS201Units = 5;

    do {
      // Asks user for their current GPA
      System.out.println("What is your current GPA?");
      while (!input.hasNextDouble()) {
        input.nextLine();
        System.out.println("A decimal GPA please!");
      }
      currentGPA = input.nextDouble();
      if (currentGPA < 0.0 || currentGPA > 4.0)
        System.out.println("A GPA between 0.0 and 4.0 please!");
    } while (currentGPA < 0.0 || currentGPA > 4.0);

    System.out.println("Your GPA is " + currentGPA + "" + ".");

    do {
      // Asks user for total number of units
      System.out.println("What is the total number of units you have taken?");
      while (!input.hasNextInt()) {
        input.nextLine();
        System.out.println("A number please!");
      }
      numOfUnits = input.nextInt();

      if (numOfUnits < 0)
        System.out.println("Invalid input!");
    } while (numOfUnits < 0);

    System.out.println("Total number of units taken: " + numOfUnits);

		/*
     * While our value for GPA (gradePoints) is two or higher, it will run
		 * until it reaches the value of two with a break at 2 (a C grade)
		 */
    while (gradePoints >= 2) {
      /*
       * Finds the effect on student's GPA for each possible grade from A
			 * to C Need to attach some arbitrary number to if statement,
			 * otherwise will cause error I could have the GPA value instead of
			 * gradePoints in (CS201Units * gradePoints), but that would leave
			 * gradePoints with nothing to work with in the calculation (it
			 * wouldn't be in it at all)
			 */
      if ((gradePoints - 0) >= .0123456789) {
        System.out.println("If you got an A (4.0):");
        double endGPA = (((currentGPA * numOfUnits) + (CS201Units * gradePoints)) / (numOfUnits + CS201Units));
        System.out.printf("Your new GPA is: %.2f. The change in GPA was: %.2f%n", endGPA,
            Math.abs(endGPA - currentGPA));
      }
      if ((gradePoints - .3) >= .0123456789) {
        gradePoints -= .3;
        System.out.println("If you got an A- (3.7):");
        double endGPA = (((currentGPA * numOfUnits) + (CS201Units * gradePoints)) / (numOfUnits + CS201Units));
        System.out.printf("Your new GPA is: %.2f. The change in GPA was: %.2f%n", endGPA,
            Math.abs(endGPA - currentGPA));
      }
      if ((gradePoints - .7) >= .0123456789) {
        gradePoints -= .4;
        System.out.println("If you got an B+ (3.3):");
        double endGPA = (((currentGPA * numOfUnits) + (CS201Units * gradePoints)) / (numOfUnits + CS201Units));
        System.out.printf("Your new GPA is: %.2f. The change in GPA was: %.2f%n", endGPA,
            Math.abs(endGPA - currentGPA));
      }
      if ((gradePoints - 1) >= .0123456789) {
        System.out.println("If you got an B (3.0):");
        gradePoints -= .3;
        double endGPA = (((currentGPA * numOfUnits) + (CS201Units * gradePoints)) / (numOfUnits + CS201Units));
        System.out.printf("Your new GPA is: %.2f. The change in GPA was: %.2f%n", endGPA,
            Math.abs(endGPA - currentGPA));
      }
      if ((gradePoints - 1.3) >= .0123456789) {
        gradePoints -= .3;
        System.out.println("If you got an B- (2.7):");
        double endGPA = (((currentGPA * numOfUnits) + (CS201Units * gradePoints)) / (numOfUnits + CS201Units));
        System.out.printf("Your new GPA is: %.2f. The change in GPA was: %.2f%n", endGPA,
            Math.abs(endGPA - currentGPA));
      }
      if ((gradePoints - 1.7) >= .0123456789) {
        gradePoints -= .4;
        System.out.println("If you got an C+ (2.3):");
        double endGPA = (((currentGPA * numOfUnits) + (CS201Units * gradePoints)) / (numOfUnits + CS201Units));
        System.out.printf("Your new GPA is: %.2f. The change in GPA was: %.2f%n", endGPA,
            Math.abs(endGPA - currentGPA));
      }
      if ((gradePoints - 2) >= .0123456789) {
        gradePoints -= .3;
        System.out.println("If you got an C (2.0):");
        double endGPA = (((currentGPA * numOfUnits) + (CS201Units * gradePoints)) / (numOfUnits + CS201Units));
        System.out.printf("Your new GPA is: %.2f. The change in GPA was: %.2f%n", endGPA,
            Math.abs(endGPA - currentGPA));

				/*
				 * Since we are at the end of our calculations for each possible
				 * grade from A to C, we need to break it off as per
				 * instructions (The loop should break after the output is shown
				 * for a grade of 2.0.) the loop will stop due to break;
				 */
        break;
      }
    }
  }
}
