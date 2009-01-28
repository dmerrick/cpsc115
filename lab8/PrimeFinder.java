/*
 * File: PrimeFinder.java
 * Author: Dana Merrick
 * Class: CPSC 115 Tuesday
 * Description: This class contains tools to find prime numbers.
 */

public class PrimeFinder
{       
  /**
   * This method returns a string containing all primes from 1 to the argument.
   * @param int max
   * @return String
   */
  public String getPrimesLessEqualN(int max)
  {
    String s = "";    // Initialize a string to the empty string
    
    for (int k = 1; k < max; k++)
    {
      if (isPrime(k))
      {
        s += k + "\t"; 
      }
    }
    return s;
  } //getPrimesLessEqualN()
  
  /**
   * This method returns true if the argument is prime.
   * @param int number
   * @return Boolean
   */
  public boolean isPrime(int number)
  {
    for (int i = 2; i < number; i++)
    {
      if (number % i == 0)
      {
        return false;
      }
    }
    return true;
  } //isPrime()
  
} //PrimeFinder
  
