/*
 * File: Crossword.java
 * Author: Dana Merrick
 * Class: CPSC 115 Tuesday
 * Description: This class holds a question and an answer,
 * and has various methods to access these variables.
 */

public class Crossword
{
  // instance variables
  private String question,answer,hint;
      
  /**
   * Object constructor, needs 2 parameters, the question and the answer.
   * @param String q 
   * @param String a
   */
  public Crossword(String q, String a, String h)
  {
    question = q;
    answer = a;
    hint = h;
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
  
    /**
   * Returns the value of hint.
   * @return String answer
   */
  public String getHint()
  {
    return hint;
  } //getHint()
} //Crossword
  
