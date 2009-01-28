/*
 * File: Analyzer.java
 * Author: Java, Java, Java
 * Description: This interface provides the analize method, a description
 * of which can be found in the documentation.
 */

public interface Analyzer {
  /** 
   * analyze() is an abstract method that should be implemented in
   *  the subclass for a particular cipher analyzer. It would perform
   *  an analysis appropriate to that particular cipher.
   * @param s, the String (message) to be analyzed.
   * @return a String giving the decryption of s.
   */
  public abstract String analyze(String s);
}
