/*
 * File: TextAnalyzer.java
 * Author: Java, Java, Java (with heavy additions by Dana Merrick)
 * Description: This class holds methods used to analyze a block of plaintext. It
 * uses a value called Chi Squared (or X^2), which is used to analyze whether 
 * two frequency distributions are the same or different.
 */

import java.io.*;

public abstract class TextAnalyzer {
  
  /**
   * englishFrequency array gives the relative frequencies of the characters 'a' to 'z'.
   *  For example, the letter 'e' has frequency 0.111, which means approximately 11.1% of characters in 
   *  English text are 'e'. The text used for these data was Tom Sawyer by Mark Twain.
   */
  protected final double englishFrequency[] = { 
    0.073,                                // a = 97   i.e., 73 occurences out of 1000, roughly 7.3
    0.016, 0.019, 0.049, 0.111,           // b,c,d,e = 11.1%
    0.021, 0.017, 0.067, 0.062,           // f,g,h,i
    0.002, 0.013, 0.040, 0.032,           // j,k,l,m
    0.066, 0.091, 0.017, 0.001,           // n,o,p,q = 0.1% i.e., 1 per 1000
    0.053, 0.061, 0.099, 0.032,           // r,s,t,u
    0.009, 0.025, 0.001, 0.025, 0.0001};  // v,w,x,y,z
  
  protected static final int NUMBER_OF_ENGLISH_LETTERS = 26; // fairly self explainatory
  
  // methods start here
  
  /**
   * The applyChiSquare() method takes a text, calculates its letter
   * frequencies, and applies the ?^2 statistic. It returns the ?^2 
   * value for that text. 
   * @param String text
   * @return double
   */
  protected double applyChiSquare(String text) {
    double observedFrequency[] = new double[NUMBER_OF_ENGLISH_LETTERS];
    
    calcFreqs(text,observedFrequency);
    
    return chiSquare(englishFrequency,observedFrequency);
  }
  
  /**
   * The chiSquare() method computes the ?2 value for a pair of arrays that
   * contain the expected and observed frequencies.
   * @param double exp[]
   * @return double obs[]
   */
  protected double chiSquare(double exp[], double obs[]) {
    double chiSquare = 0;
    for (int i=0; i < NUMBER_OF_ENGLISH_LETTERS; i++) {
      chiSquare += Math.pow(obs[i]-exp[i],2)/exp[i];
    }
    
    return chiSquare;
  }
  
  /**
   * The calcFreqs() method is given a text and a 26-element array and
   * calculates the letter frequencies for that text, storing them in the array.
   * @param String text
   * @return double freqs[]
   */
  protected abstract void calcFreqs(String text, double freqs[]);
  
  /**
   * Reads the named text file and returns its contents as a string.
   * @param fName is a string giving the files name (full path)
   * @return the contents of fName as a String
   */
  public String readFile(String fName) {
    String msg="";
    try {
      File theFile = new File(fName);
      InputStreamReader iStream = new InputStreamReader( new FileInputStream(theFile));
      int length = (int)theFile.length();
      char input[] = new char[length];
      iStream.read(input);
      msg = new String(input);
    } catch (IOException e) {
      e.printStackTrace();
    } // catch
    return msg;
  }
  
} // TextAnalyzer

