/* 
 * File: AlphyPalphyTranslator.java
 * Author: Java Java Java Staff
 * Description: This class translates a string into Alphy Palphy,
 *  using the following rules:
 *  1) The string "alph" is placed before every singleton vowel.
 */
public class AlphyPalphyTranslator extends Translator {

    /**
     * translateWord() translates its parameter into AlphyPalphy
     *  using the rules given above.
     * @param s -- a String representing a word
     * @return a String giving Pig Latin translation of s
     */
    public String translateWord (String s){
        StringBuffer result = new StringBuffer("");
	s = s.toLowerCase();
	int k = 0;
	while (k < s.length()) {
	    char ch = s.charAt(k);
	    if (!isVowel(ch) || Character.isWhitespace(ch)) {
		result.append(ch);
		++k;
	    } else {  // ch is a vowel
		result.append("alph");
		result.append(ch);
		++k;
		while (k < s.length() && isVowel(s.charAt(k))) { // Skip over vowels
		    result.append(s.charAt(k));
		    ++k;
		}
	    }
	}
        return result.toString() + " ";
    } // translateWord()
	
    
    private boolean isVowel(char ch) {
	return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String args[]) {
        String str = "what do you say can you speak english";
	System.out.println(str);
	AlphyPalphyTranslator apt = new AlphyPalphyTranslator();
	System.out.println(apt.translate(str));
	/**
	System.out.println(apt.translate("what"));
	System.out.println(apt.translate("do"));
	System.out.println(apt.translate("you"));
	System.out.println(apt.translate("say"));
	System.out.println(apt.translate("can"));
	System.out.println(apt.translate("speak"));
	**/
    }
} // AlphyPalphyTranslator
