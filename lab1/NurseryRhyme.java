/*
 * File: NurseryRhyme.java
 * Author: Dana Merrick
 * Course: CPSC 115 Tuesday
 * Description: A program to print a nursery rhyme from a file.
 */
import java.io.*;

public class NurseryRhyme
  {
    // variables
    private String song = "This is the backup song!";  // this prints if there are no arguments

    //main()
    public static void main(String args[]) throws Exception
      {
        NurseryRhyme nurseryRhyme = new NurseryRhyme();

        // check for file arguments before setting up the file
        if ( args[0] != null)
          {
            File file = new File( args[0] );
            // make sure the we can use that file
            if (file.exists() && file.canRead())
            {
              nurseryRhyme.singFile(file);
            }
        } else
        {
          nurseryRhyme.sing(); // sing the backup song
        }
    }  //  main()

    //methods
    /**
    * Takes a file as a command line argument and sends it to {@link STDOUT}. Essentially a {@link cat} clone.
    * If no argument is specified, it calls {@link sing()}.
    * @param  file  a file to send to {@link STDOUT}.
    * @author Dana Merrick
    */
    public void singFile( File file ) throws Exception
    {
      // set up the file
      // would a stream be easier? look into that.
      FileReader fileReader = new FileReader(file);
      BufferedReader input = new BufferedReader(fileReader);
      String line;
      while ((line = input.readLine()) != null)
        System.out.println(line); // print each line until the end of the file
      fileReader.close();
    } // singFile()
  
    /**
     * Prints the backup song to {@link STDOUT}.
     * @author Dana Merrick
     */
    public void sing()
    {
      System.out.println(song);
    } // sing()

  }  // NurseryRhyme

