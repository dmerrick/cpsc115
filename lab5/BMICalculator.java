/*
 * File: BMICalculator.java
 * Author: Dana Merrick
 * Class: CPSC 115 Tuesday
 * Description: A class that calculates Body Mass Index from height and weight.
 */

public class BMICalculator
{
  // instance variables
  private double height, weight, bmi;
  
  /**
   * Constructs a new object with a height and weight, and calculates the BMI.
   * @param double h
   * @param double w
   */
  public BMICalculator(double h,double w)
  {
    height = h;
    weight = w;
    
    //calculate bmi
    bmi = (weight/(height * height) * 703);
  } //BMICalculator()
  
  /**
   * Accessor method that returns BMI.
   * @return int bmi
   */
  public double getBMI()
  {
    return bmi;
  }//getBMI()
 
  /**
   * Method that returns the rating of the BMI.
   * @return String
   */
  public String rateBMI()
  {
    if (bmi < 18.5) {
      return "Underweight";
    } else if (bmi < 25) {
      return "Normal";
    } else if (bmi < 30) {
      return "Overweight";
    } else {
      return "Obese";
    }
  }//rateBMI()
  
} //BMICalculator

