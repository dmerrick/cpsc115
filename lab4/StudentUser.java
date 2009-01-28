/*
 * File: StudentUser.java
 * Author: Dana Merrick
 * Class: CPSC 115 Tuesday
 */

import java.util.Scanner;

public class StudentUser
{ 
  /**
   * Main method, shows some information about student records and lets you update it with user input.
   */
  public static void main(String argv[])
  {
    // create the objects
    Scanner scanner = new Scanner(System.in);
    Student studentOne = new Student("Joe Smith",23);
    Student studentTwo = new Student("Kim Java",33);
    
    // intro message
    System.out.println("This program will help you update and display student records.\n");
    
    // start studentOne
    System.out.println("Student " + studentOne.getName() + " currently has " + studentOne.getCredits() + " credits.");
    System.out.print("How many additional credits would you like to add for " + studentOne.getName() + ": ");
    // scan for input
    studentOne.addCredits(scanner.nextInt()); //notice it uses Scanner's nextInt()
    System.out.println("Student " + studentOne.getName() + " currently has " + studentOne.getCredits() + " credits.");
    
    // check if they passed
    if (studentOne.isEligibleToGraduate())
    {
      System.out.println(studentOne.getName() + " IS eligible to graduate.\n");
    } else { // student fails!
      System.out.println(studentOne.getName() + " IS NOT eligible to graduate.\n");
    }
    // end studentOne
    
    // start studentTwo
    System.out.println("Student " + studentTwo.getName() + " currently has " + studentTwo.getCredits() + " credits.");
    System.out.print("How many additional credits would you like to add for " + studentTwo.getName() + ": ");
    // scan for input
    studentTwo.addCredits(scanner.nextInt()); //notice it uses Scanner's nextInt()
    System.out.println("Student " + studentTwo.getName() + " currently has " + studentTwo.getCredits() + " credits.");      
    
    // check if they passed
    if (studentTwo.isEligibleToGraduate())
    {
      System.out.println(studentTwo.getName() + " IS eligible to graduate.\n");
    } else { // student fails!
      System.out.println(studentTwo.getName() + " IS NOT eligible to graduate.\n");
    }
  } //main()
  
} //StudentUser

