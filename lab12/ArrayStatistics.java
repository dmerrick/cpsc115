/*
 * File: ArrayStatistics.java
 * Author: Dana Merrick
 * Class: CPSC 115 Tuesday
 * Description: This class is an example of using implementation. It holds
 * various methods that give information about an array of numbers, including
 * its size, average, and min/max values.
 */
public class ArrayStatistics implements Statistics {
  
  // instance variables
  private double data[]; // this is the array we will be working with
  
  
  /**
   * Object constructor. This just creates a small array for testing purposes.
   */
  public ArrayStatistics() {
    // create a small test array {1,2,3,4}
    data = new double[4];
    for ( int i=0; i < data.length;i++)
      data[i]=i+1;
  }
  
  /**
   * Object constructor, takes one int parameter that determines the size of 
   * the array to be tested. Fills it with random values in (0,1].
   * @param int n
   */
  public ArrayStatistics(int n) {
    data = new double[n];
    for ( int i=0; i < data.length;i++)
      data[i]=Math.random();
  }
  

  /**
   * Returns the length of data.
   * @return int
   */
  public int count() {
    return data.length;
  }
  
  /**
   * Returns the sum of the elements of data.
   * @return double
   */
  public double sum() {
    double result = 0;
    for ( int i=0; i < data.length;i++)
      result += data[i];
    return result;
  }
  
  /**
   * Returns the average of the elements of data.
   * @return double
   */
  public double average() {
    return sum()/count();
  }
  
  /**
   * Returns the smallest element of data.
   * @return double
   */
  public double min() {
    double min = 1;
    for ( int i=0; i < data.length;i++) {
      if (data[i] < min)
        min = data[i];
    }
    return min;
  }
  
  /**
   * Returns the largest element of data.
   * @return double
   */
  public double max() {
    double max = 0;
    for ( int i=0; i < data.length;i++) {
      if (data[i] > max)
        max = data[i];
    }
    return max;
  }
  
  /**
   * Returns the variance of the elements of data. From the assignment:
   * 
   * Variance is defined as the mean of the squares minus the square of the mean.
   * For example, if your array contains the values, 1, 2, 3, and 4,
   * the mean would be (1+2+3+4)/4 = 2.5. And its square would be 6.25.
   * The mean of the squares would be (1*1 + 2*2 + 3*3 + 4*4)/4 = 7.5.
   * Therefore the variance would be 7.5 - 6.25 = 1.25.
   * 
   * @return double
   */
  public double variance() {
    double meanOfSquares = 0;
    double squareOfMeans = Math.pow(average(),2);
    for ( int i=0; i < data.length;i++)
      meanOfSquares += Math.pow(data[i],2);
    meanOfSquares /= count();
    
    return meanOfSquares - squareOfMeans;
  }
  
  /**
   * This is the method that runs the program, asking the user for the
   * size of the array and returning statistics on it.
   */
  public static void main(String args[]) {
    // ask for input
    System.out.println("Please input the size of the array > ");
    // take the input
    ArrayStatistics stat = new ArrayStatistics( new java.util.Scanner(System.in).nextInt() );
    
    // return the statistics
    System.out.println("Count: " + stat.count());
    System.out.println("Sum: " + stat.sum());
    System.out.println("Average: " + stat.average());
    System.out.println("Min: " + stat.min());
    System.out.println("Max: " + stat.max());
    System.out.println( "Variance: " + stat.variance());
  }
  
  
}