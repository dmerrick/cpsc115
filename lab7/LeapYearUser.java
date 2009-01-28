/*
 * File: LeapYearuser.java
 * Author: Dana Merrick
 * Class: CPSC 115 Tuesday
 */

import java.util.Scanner;

public class LeapYearUser
{
  //instance variables
  public static String nextGuess=""; // initialized to the empty string so isCorrectGuess evaluates false
    
  /**
   * Asks you a question and accepts keyboard input for the answer.
   * Loops until you guess correctly or break.
   */
  public static void main(String argv[])
    {
      Scanner scanner = new Scanner(System.in);
      LeapYear game = new LeapYear("Four letter word for me.","dana");
      System.out.println(game.getClue());
      while( game.isCorrectGuess(nextGuess) == false) 
      {
        System.out.println("Your guess: ");
        nextGuess = scanner.next();
      }
      System.out.println("You win! The answer was: " + game.getWord() + ".");
     } //main()
} //LeapYearUser
  
