/*
 * File: MissMaryMac.java
 * Author: Dana Merrick
 * Course: CPSC 115 Tuesday
 * Description: A program to print a nursery rhyme.
 */

public class MissMaryMac
  {
    // variables
    private String song = " Miss Mary Mack Mack Mack\n All dressed in black, black, black\n With silver buttons, buttons, buttons\n All down her back, back, back.\n \n She asked her mother, mother, mother\n For 50 cents, cents, cents\n To see the elephants, elephants, elephants\n Jump over the fence, fence, fence.\n \n They jumped so high, high, high\n They reached the sky, sky, sky\n And they didn't come back, back, back\n 'Til the 4th of July, ly, ly!\n"; 

    // main()
    public static void main(String args[])
      {
        MissMaryMac missMaryMac = new MissMaryMac();
        missMaryMac.sing();                            // sing the song!
      }  //  main()

    //methods
    /**
    * Prints a song to {@link STDOUT}.
    * @author Dana Merrick
    */
    public void sing()
    {
      System.out.println(song);
    } // sing()

  }  // MissMaryMac

