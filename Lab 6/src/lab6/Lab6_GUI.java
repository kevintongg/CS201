package lab6;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lab6_GUI {

  final static double PI = Math.PI;

  static double greatestTriangle = 0;
  static double greatestSphere = 0;
  static double greatestCylinder = 0;

  public static void main(String[] args) {

    int pick = 0;

    DecimalFormat df = new DecimalFormat("#.##");

    do {
      String input = JOptionPane.showInputDialog(null,
          "Enter 0 to quit, 1 to calculate the area of a triangle, 2 to calculate the volume of a sphere, 3 to calculate the volume of a cylinder.",
          "Geometric Calculations", JOptionPane.PLAIN_MESSAGE);
      pick = Integer.parseInt(input);
      switch (pick) {
        case 1:
          JOptionPane.showMessageDialog(null,
              "The area for your triangle is: " + df.format(calcTriangleArea()) + ".",
              "Triangle Area", JOptionPane.PLAIN_MESSAGE);
          break;
        case 2:
          JOptionPane.showMessageDialog(null,
              "The volume for your sphere is: " + df.format(calcSphereVolume()) + ".",
              "Sphere Volume", JOptionPane.PLAIN_MESSAGE);
          break;
        case 3:
          JOptionPane.showMessageDialog(null,
              "The volume for your cylinder is: " + df.format(calcCylinderVolume()) + ".",
              "Cylinder Volume", JOptionPane.PLAIN_MESSAGE);
          break;
      }
      if (pick < 0 || pick > 3) {
        JOptionPane.showMessageDialog(null,
            "Invalid input! Please enter 0 to quit, 1 to calculate the area of a triangle, 2 to calculate the volume of a sphere, 3 to calculate the volume of a cylinder.",
            "Try Again", JOptionPane.PLAIN_MESSAGE);
      }
    } while (pick != 0);

    JOptionPane.showMessageDialog(null, "The greatest area calculated for your triangle is: " + df
            .format(checkTriangle(greatestTriangle)) + "." + "\n"
            + "The greatest volume calculated for your sphere is: " + df
            .format(checkSphere(greatestSphere)) + "." + "\n"
            + "The greatest volume calculated for your cylinder is: " + df
            .format(checkCylinder(greatestCylinder)) + ".", "Maximum Values",
        JOptionPane.PLAIN_MESSAGE);
  }

  public static double calcTriangleArea() {

    double base;
    double h1;
    double triangleArea;

    do {
      // Asks user for a base
      String triangleBase = JOptionPane
          .showInputDialog(null, "Please input a base between 0.0 and 123.45", "Triangle Base",
              JOptionPane.PLAIN_MESSAGE);
      base = Double.parseDouble(triangleBase);
      if (base < 0.0 || base > 123.45) {
        JOptionPane
            .showMessageDialog(null, "A base value between 0.0 and 123.45 please!", "Try Again",
                JOptionPane.PLAIN_MESSAGE);
      }
    } while (base < 0.0 || base > 123.45);

    do {
      // Asks user a height
      String triangleHeight = JOptionPane.showInputDialog(null,
          "Please enter a height between 0.0 and 123.45. (If first value already entered, please enter a value bigger than that)",
          "Triangle Height ", JOptionPane.PLAIN_MESSAGE);
      h1 = Double.parseDouble(triangleHeight);
      if (base > h1 || h1 > 123.45) {
        JOptionPane.showMessageDialog(null,
            "A height value that is higher than the first number, but no more than 123.45 please!",
            "Try Again", JOptionPane.PLAIN_MESSAGE);
      }
    } while (base > h1 || h1 > 123.45);

    triangleArea = (1 / 2.0) * base * h1;

    checkTriangle(triangleArea);

    return triangleArea;

  }

  public static double calcSphereVolume() {

    double r2;
    double sphereVolume;

    do {
      // Asks user for a radius
      String sphereRadius = JOptionPane
          .showInputDialog(null, "Please input a radius value between 0.0 and 123.45.",
              "Sphere Radius", JOptionPane.PLAIN_MESSAGE);
      r2 = Double.parseDouble(sphereRadius);
      if (r2 < 0.0 || r2 > 123.45) {
        JOptionPane
            .showMessageDialog(null, "A radius value between 0.0 and 123.45 please!", "Try Again",
                JOptionPane.PLAIN_MESSAGE);
      }
    } while (r2 < 0.0 || r2 > 123.45);

    sphereVolume = (4 / 3.0) * PI * Math.pow(r2, 3);

    checkSphere(sphereVolume);

    return sphereVolume;
  }

  public static double calcCylinderVolume() {

    double r2;
    double h2;
    double cylinderVolume;

    do {
      // Asks user for a radius
      String cylinderRadius = JOptionPane
          .showInputDialog(null, "Please input a radius between 0.0 and 123.45.", "Cylinder Radius",
              JOptionPane.PLAIN_MESSAGE);
      r2 = Double.parseDouble(cylinderRadius);
      if (r2 < 0.0 || r2 > 123.45) {
        JOptionPane
            .showMessageDialog(null, "A radius value between 0.0 and 123.45 please!", "Try Again",
                JOptionPane.PLAIN_MESSAGE);
      }
    } while (r2 < 0.0 || r2 > 123.45);

    do {
      // Asks user for a height
      String cylinderHeight = JOptionPane.showInputDialog(null,
          "Please enter a height between 0.0 and 123.45. (If first value already entered, please enter a value bigger than that)",
          "Cylinder Height", JOptionPane.PLAIN_MESSAGE);
      h2 = Double.parseDouble(cylinderHeight);
      if (r2 > h2 || h2 > 123.45) {
        JOptionPane.showMessageDialog(null,
            "A height value that is higher than the first number, but no more than 123.45 please!",
            "Try Again", JOptionPane.PLAIN_MESSAGE);
      }
    } while (r2 > h2 || h2 > 123.45);

    cylinderVolume = PI * Math.pow(r2, 2) * h2;

    checkCylinder(cylinderVolume);

    return cylinderVolume;
  }

  public static double checkTriangle(double max) {
    if (max > greatestTriangle) {
      greatestTriangle = max;
    }
    return greatestTriangle;
  }

  public static double checkSphere(double max) {
    if (max > greatestSphere) {
      greatestSphere = max;
    }
    return greatestSphere;
  }

  public static double checkCylinder(double max) {
    if (max > greatestCylinder) {
      greatestCylinder = max;
    }
    return greatestCylinder;
  }
}