package lab2;

public class Lab2 {

  public static void main(String[] args) {

    // Declares an int with value 42 and casts it to a double
    int x = 42;
    System.out.println("#1");
    System.out.println((double) x);

    // Declares a double variable with the value 49.9 and casts it to an int
    double y = 49.9;
    System.out.println("#2");
    System.out.println((int) y);

    // Declares an int variable with the value -2147483647, then subtracts 1. Output the value both before and after the addition.
    int bit1 = -2147483647;
    System.out.println("#3");
    System.out.println("-2147483647");
    System.out.println(bit1 - 1);

    // Declares an int variable with the value -2147483648, prints out the value, then subtracts 1 and prints out the value, then subtracts 1 again and prints out the value.
    int bit2 = -2147483648;
    System.out.println("#4");
    System.out.println(bit2);
    System.out.println(bit2 - 1);
    System.out.println(bit2 - 2);

		/*
     * Calculates the volume of a sphere this way:
		 * Declares a final double called PI with the value 3.1416
		 * Declares an int variable called radius and sets its value to 5
		 * Uses the formula V = 4/3 PI radius^3 to calculate the volume. Show the result to exactly three digits past the decimal point.
		 *
		 */
    final double PI = 3.1416;
    int radius = 5;
    System.out.println("#5");
    System.out.printf("%.3f", 4.d / 3.d * PI * Math.pow(radius, 3));

		/* Converts your height in inches to your height in centimeters this way:
    * Creates a final double called INCHESTOCM and sets its value to the appropriate conversion constant, which is 2.54.
		* Creates a variable of type double and sets its value to your height in inches. I do not care whether you tell the truth about this.
		* Calculates and outputs your height in cm. Use the formula CM = inches * INCHESTOCM.
		*
		*/
    final double INCHES_TO_CM = 2.54;
    double height = 70.5;
    System.out.println("\n#6");
    System.out.println(height * INCHES_TO_CM);

    // Uses the formula C = (F - 32) * 5/9 to convert the following values from Fahrenheit to Celsius: -40, 0, and 212
    int temp1 = -40;
    int temp2 = 0;
    int temp3 = 212;
    System.out.println("#7");
    System.out.println(((temp1 - 32) * 5.d / 9.d) + " °C");
    System.out.printf("%.1f °C", ((temp2 - 32) * 5.d / 9.d));
    System.out.printf("\n" + ((temp3 - 32) * 5.d / 9.d + " °C"));
		
		/*
		 * Tests two values for divisibility by 7 this way:
		 * Creates an int variable, sets its value to 111, and uses modulo to determine whether the value is evenly divisible by 7
		 * Assigns the new value 112 to the int variable, and uses modulo to determine whether the value is evenly divisible by 7
		 *
		 */
    int d1 = 111;
    int d2 = 112;
    System.out.println("\n#8");
    System.out.println(d1 % 7);
    System.out.println(d2 % 7);

    // Determines and outputs whether it is true that 1 + 2 is less than 10 but false that 5 > 7
    System.out.println("#9");
    if (1 + 2 <= 10 && !(5 > 7)) {
      System.out.println("True.");
    } else {
      System.out.println("False.");
    }
		
		/* Declares variables of the appropriate types and sets them to your age in years and GPA (no need to tell the truth) and determines whether
		 * a) either your age is greater than 25 or your GPA is greater than 3.0
		 * b) your age is greater than 25 *and* your GPA is also greater than 3.0.
		 * In each case, write code that evaluates the expression and sets the value of a boolean variable to the result, then print the value of the variable.
		 *
		 */
    int age = 25;
    double GPA = 3.0;
    boolean a;
    boolean b;

    System.out.println("#10");

    if (age > 25 || GPA > 3.0) {
      System.out.println("Your age or GPA is greater than the values of age of 25 or GPA of 3.0");
      a = true;
      System.out.println(true);
    } else {
      System.out.println("Your age or GPA is not greater than the values of age of 25 or GPA of 3.0");
      b = false;
      System.out.println(false);
    }
    if (age > 25 && GPA > 3.0) {
      System.out.println("Your age and GPA is greater than the values of age of 25 and GPA of 3.0");
      a = true;
      System.out.println(true);
    } else {
      System.out.println("Your age and GPA is not greater than the values of age of 25 and GPA of 3.0");
      b = false;
      System.out.println(false);
    }

  } // end main method

}
