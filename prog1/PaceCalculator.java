/*
 * File: PaceCalculator.java
 * Author: Dana Merrick
 * Class: CPSC 115 Tuesday
 * Description: This class contains various tools for a runner to measure his pace.
 */

public class PaceCalculator
{
  // instance variables
  private int hours,minutes,seconds;
  private double miles;
  
  private static final double CONVERSION_RATE = 0.62;
  
  /**
   * Object constructor, takes the time and the distance.
   * @param int h,m,s
   * @param double d
   */
  public PaceCalculator(int h,int m,int s,double d)
  {
    hours = h;
    minutes = m;
    seconds = s;
    miles = d;
  } //PaceCalculator()
    
  /**
   * This method uses the instance variables to calculate pace.
   * @return double
   */
  public double minsPerMile()
  {
     double totalMinutes = hours*60 + minutes + (double)seconds/60; // uses promotion
     return Math.floor(totalMinutes / miles * 100.0 + 0.5) / 100.0; // round it off
  } //minsPerMile()
  
  /**
   * This converts a number of kilometers to miles.
   * @param double km
   * @return double
   */
  public static double kmToMiles(double km)
  {
    return km * CONVERSION_RATE;
  } //kmToMiles()

} //PaceCalculator
  
