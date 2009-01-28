/*
 * File: Student.java
 * Author: Dana Merrick
 * Class: CPSC 115 Tuesday
 */

public class Student
{
  // instance variables
  private String name;
  private int credits;
  
  /**
   * Constructer method, takes student's name and credits.
   * @param String s
   * @param int n
   */
  public Student(String s, int n)
  {
    name = s;
    credits = n;
  } //Student()
  
  /**
   * Accessor method that returns student's name.
   * @return String name
   */
  public String getName()
  {
    return name;
  }//getName()
  
  /**
   * Accessor method that returns student's credits;
   * @return int credits
   */
  public int getCredits()
  {
    return credits;
  }//getCredits()
  
  /**
   * Adds new credits from the parameter to the total credits for the student.
   * @param int n
   */
  public void addCredits(int n)
  {
    credits= n + credits;
  }//addCredits()
  
  /**
   * Returns true if the student has enough credits to graduate.
   * @return boolean
   */
  public boolean isEligibleToGraduate()
  {
    return credits >= 36;
  }//isEligibleToGraduate()
  
} //Student

