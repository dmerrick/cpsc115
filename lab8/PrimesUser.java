/*
 * File: PrimesUser.java
 * Author: Dana Merrick
 * Class: CPSC 115 Tuesday
 */

public class PrimesUser
{  
  public static void main(String argv[])
    {
      PrimeFinder prime = new PrimeFinder();
      int test = 5;
      for (test = 0; test < 10; test++)
      {
      if (prime.isPrime(test))
         System.out.println(test + " is prime");
      else
          System.out.println(test + " is not prime");
      }
      
      System.out.println(prime.getPrimesLessEqualN(10));
     } //main()
} //PrimesUser
  
