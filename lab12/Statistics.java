/*
 * File: Statistics.java
 * Author: Dana Merrick
 * Class: CPSC 115 Tuesday
 * Description: This is the Statistics interface. It holds method signatures for
 * various methods that return stats.
 */
public interface Statistics  {
  
  // in interfaces, methods have no body.
  
  public int count(); 
  public double sum();
  public double average();
  public double min();
  public double max();
  public double variance();
}

