/*
 * File: FrequencyAnalyzer.java
 * Author: Java, Java, Java (with heavy additions by Dana Merrick)
 * Description: This class uses the TextAnalyzer class to actually perform 
 * an analysis of a text file given from the command line, eventually 
 * providing information on whether or not the file is written in English.
 */

import java.io.*;

public class FrequencyAnalyzer extends TextAnalyzer {
  
  /** 
   * The analyze() method takes a text and performs the frequency analysis
   * on it and returns a string that represents the report seen in the 
   * assignment.
   * @param String text
   * @return String
   */
  public String analyze(String text) {
    String s = "";
    double chiSquare = applyChiSquare(text);
    s += "The Chi square value for this text is " + chiSquare + ".\n";
    
    // let's figure out the likelyhood that our file is English
    String likelyhood = "";
    if (chiSquare < 0.01)
      likelyhood = "ALMOST CERTAINLY";
    else if (chiSquare >= 0.01 && chiSquare < 0.15)
      likelyhood = "VERY LIKELY";
    else if (chiSquare >= 0.15 && chiSquare < 0.25)
      likelyhood = "PROBABLY";
    else likelyhood = "PROBABLY NOT";
    
    s += "This text is " + likelyhood + " written in English";
    
    return s;
  }
  
  
  /**
   * The calcFreqs() method is given a text and a 26-element array and
   * calculates the letter frequencies for that text, storing them in the array.
   * @param String text
   * @return double freqs[]
   */
  protected void calcFreqs(String text, double freqs[]) {
    
    // maybe check to make sure freqs.length is super.NUMBER_OF_ENGLISH_LETTERS?
    
    text = text.toLowerCase();       // let's just remove all capitol letters
    int lettersOnly = text.length(); // this is the length of only the letters
    
    char current = 0; // the current character
    for (int i=0; i < text.length(); i++) {
      current = text.charAt(i);
      if (current >= 'a' && current <= 'z') // make sure it's only the english alphabet
        ++freqs[current-'a'];
      else --lettersOnly;         // if it's not, remove that character from the length
    }
    for (int j=0; j < freqs.length; j++) {
      freqs[j] /= lettersOnly;
    }
  }
  
  /*
   * The program's main method, given in the assignment. Creates a 
   * FrequencyAnalyzer object and analyzes a file given via the
   * command line.
   */
  public static void main(String args[]) {
    String msg="";
    FrequencyAnalyzer analyzer = new FrequencyAnalyzer();
    
    if (args.length == 0) {
      System.out.println("Usage: java FrequencyAnalyzer filename");
      System.exit(0);
    } else {
      msg = analyzer.readFile(args[0]);
      //msg = analyzer.readFile("testFile.txt");
      System.out.println(analyzer.analyze(msg));
    }
  }
  
} // FrequencyAnalyzer

