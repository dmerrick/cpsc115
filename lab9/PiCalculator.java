/*
 * File: PiCalculatorulator.java
 * Author: Dana Merrick
 * Class: CPSC 115 Tuesday
 * Description: This class holds a command line utility to calculate pi to a specific error.
 */

import java.util.Scanner; // import the scanner

public class PiCalculator
{       
  // instance variables
  private int nIterations=0; // we haven't started yet, so it's zero.
  
  /**
   * Just the plain old default constructor.
   */  
  public PiCalculator()
  {
  } //PiCalculator()
  
  
  /**
   * Returns the number of iterations.
   * @return int nIterations
   */
  public int getIterations()
  {
    return nIterations;
  } //getIterations()
  
  /**
   * This method takes number and uses a basic series to calculate pi to
   * within that number. (That is, it will keep going as long as the 
   * previous iteration was that number away on the number line.) It returns
   * its estimation of pi.
   * @param double error
   * @return double
   */
  public double calcPi(double error)
  {
    int sign=4;              // let's start at 4 so we don't have to worry about that later.
    double current=0,last=1; // we set default values here so the compliler wont complain.
    
    for (int i = 1; Math.abs(current - last) > error; i += 2)
    {
      last = current;              // save the previous value
      current += (double)sign / i; // apply the series
      sign = -sign;                // swith the sign
      // (there is a prettier way to do this, but I'll save it for the final)
      
      ++nIterations; // increment the number of iterations
      
      // helpful debug info (careful, ugly!)
      //System.out.println("Current\t\tLast\t\tnIterations\t\tsign\t\ti");
      //System.out.println(current + "\t" + last + "\t" + nIterations + "\t\t" + sign + "\t" + i);             
    }
    return current;
  } //calcPi()
  
  public static void main(String args[])
  {
      Scanner scanner = new Scanner(System.in); // make the scanner
      PiCalculator piCalc = new PiCalculator(); // ... and the PiCalculator
      System.out.println("Please input the margin of error: ");
      double input = scanner.nextDouble();      // accept input
      System.out.println("Caculating pi within " + input + ".");
      System.out.println("Pi = " + piCalc.calcPi(input)); // it runs here
      System.out.println("That calculation took " + piCalc.getIterations() + " iterations.");
  } //main()
  
} //PiCalculator
  
