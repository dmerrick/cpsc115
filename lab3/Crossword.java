/*
 * File: Crossword.java
 * Author: Dana Merrick
 * Class: CPSC 115 Tuesday
 */

public class Crossword
{
  // instance variables
  private String question;
  private String answer;
      
  /**
   * Object constructor, needs 2 parameters, the question and the answer.
   * @param String q 
   * @param String a
   */
  public Crossword(String q, String a)
  {
    question = q;
    answer = a;
  } //Crossword()
    
  /**
   * Returns true if the value of guess equals the value of answer.
   * @return Boolean
   */
  public boolean isCorrectGuess(String guess)
  {
    return guess.equals(answer);
  } //isCorrectGuess()
  
  /**
   * Returns the value of question.
   * @return String question
   */
  public String getClue()
  {
    return question;
  } //getClue()
  
  /**
   * Returns the value of answer.
   * @return String answer
   */
  public String getWord()
  {
    return answer;
  } //getWord()
} //Crossword
  
