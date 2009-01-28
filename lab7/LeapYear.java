/*
 * File: LeapYear.java
 * Author: Dana Merrick
 * Class: CPSC 115 Tuesday
 * Description: This class holds the static method to determine if a given 
 * year is a leap year.
 */

public final class LeapYear
{       
  /**
   * Returns true if the value of year is a leap year.
   * @param int year
   * @return Boolean
   */
  public static boolean isLeapYear(int year)
  {
    return year % 4 == 0 && year % 100 != 0 || year % 400 ==0;
  } //isLeap Year()
  
} //LeapYear
  
