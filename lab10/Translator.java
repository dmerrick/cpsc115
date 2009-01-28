/* 
 * File: Translator.java
 * Author: Java Java Java Staff
 * Description: Superclass for various kinds of translaters.
 */

import java.util.StringTokenizer;

public abstract class Translator  {

    /** Default constructor */
    public Translator() { } 

    /**
     * translate() translates its parameter which is string containing zero or more
     *  more words into Pig Latin using the rules given above.
     * @param s -- a String representing a sentence
     * @return a String giving Pig Latin translation of s
     * Algorithm: Note the use of StringTokenizer to break up the 
     *  sentence and StringBuffer to build the result string.
     */
    public String translate (String s) {
        StringBuffer result = new StringBuffer("");
        StringTokenizer words = new StringTokenizer(s);  // Tokenizer
        while (words.hasMoreTokens())
            result.append(translateWord(words.nextToken()));
        return result.toString();
    }
	
    /**
     * translateWord() translates a single word. It will be implemented
     *  by the subclass.
     * @param s -- a String representing a word
     * @return a translation defined by the subclass
     */
    public abstract String translateWord (String s);
	
} // Translator
