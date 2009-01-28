/*
 * File: RateMyBMI.java
 * Author: Dana Merrick
 * Class: CPSC 115 Tuesday
 * Description: A class that implements the BMI calculator and uses user input to calculate BMI.
 */

import java.util.Scanner;

public class RateMyBMI
{ 
  /**
   * Main method, shows some information about student records and lets you update it with user input.
   */
  public static void main(String argv[])
  {
    // instance variables
    double height, weight;
    
    // create the scanner object
    Scanner scanner = new Scanner(System.in);
    
    // intro message
    System.out.println("This program will calculate your Body Mass Index.");
    System.out.println("In pounds and inches. BMI = (Wgt/(Hgt * Hgt) * 703)");
    
    // ask for height
    System.out.println("Input your height in inches > ");
    height = scanner.nextDouble();
    
    // ask for weight
    System.out.println("Input your weight in pounds > ");
    weight = scanner.nextDouble();
      
    // construct the BMICalculator object
    BMICalculator newBMI = new BMICalculator(height,weight);
    
    // return the info
    System.out.println("Your BMI is: " + newBMI.getBMI() + ".");
    System.out.println("Your BMI suggests your weight is: " + newBMI.rateBMI() + ".");

  } //main()
  
} //RateMyBMI

