/* 
 * File: PigLatin.java
 * Author: Java Java Java (with major modifications by Dana Merrick)
 * Description: This class translates a string into Pig Latin,
 *  using the following rules:
 *   1) If the word begins with a consonant --such as string or latin--- divide the word at the first vowel, swap the front and back halves, and append "ay" to the end--ing + str + ay gives ingstray and atin + l + ay gives atinlay.
 *   2) If the word begins with a vowel--such as am or i-- just append "yay" to the word--am + yay gives amyay and i + yay gives iyay.
 *   3) If the word has no vowels (not counting 'y')--such as my or hymn-- just append "yay" to it--my + yay gives myyay and hymn + yay gives hymnyay. 
 */
public class PigLatin extends Translator {
  
  /**
   * translateWord() translates its parameter into Pig Latin
   *  using the rules given above. It is a method that overrides
   * the abstract method in the Translator class.
   * @param s -- a String representing a word
   * @return a String giving Pig Latin translation of s
   */
  public String translateWord (String s){
    String result = "";            // no need for a StringBuffer here, it just makes us need more type conversions
    String word = s.toLowerCase(); // we dont want to bother with caps
    
    // start the translation
    if (findFirstVowel(word) == 0 && word.charAt(word.length()-1) == 'y') // no vowels and ends in "y"
      result = word + "ay";
    else if (findFirstVowel(word) == 0) // starts with vowel or has none
    //else if (isVowel(word.charAt(0)) || findFirstVowel(word) == 0) // starts with vowel or has none
      result = word + "yay";
    else {
      int firstVowel = findFirstVowel(word);
      result = word.substring(firstVowel) + word.substring(0,firstVowel) + "ay";
    }
    return result + " ";
  } // translateWord()
  
  /**
   * This method scans through the parameter it is given and returns the location of the first vowel.
   * @param s -- a String representing a word
   * @return int
   */
  private int findFirstVowel(String s)
  {
    s = s.toLowerCase(); // we dont want to bother with caps
    int k = 0;
    
    while (k < s.length()) {                            // loop through the word
      char ch = s.charAt(k);                            // look at each letter
      if (!isVowel(ch) || Character.isWhitespace(ch)) { // should we move on?
        ++k;                                            // okay, move on
      } else {                                          // ch is a vowel
        return k;
      }
    }
    return 0; // no vowels, but we keep it at 0 because it helps us in the nested if section.
              // in another situation, we would probably want it to return -1.
  }
  
  /**
   * This method returns true if the parameter is a vowel.
   * Case doesn't matter because we've already made the char lowercase.
   * @param ch
   */
  private boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
  }
  
  /**
   * This is the main method for testing purposes.
   */
  public static void main(String args[]) {
    String str = "this is my hymn in pig latin";
    System.out.println(str);
    PigLatin pig = new PigLatin();
    System.out.println(pig.translate(str));
    // for testing:
    //System.out.println("what" + "\t" + pig.translate("what") + "\t" + pig.findFirstVowel("what"));
  }
} // PigLatin
