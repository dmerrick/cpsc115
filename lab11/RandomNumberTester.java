/* 
 * File: RandomNumberTester.java
 * Author: Dana Merrick
 * Description: This class holds various methods to test Java's Math.random() function.
 * It uses an array to hold the average of various simulated die rolls.
 */
public class RandomNumberTester{
  
  // instance variables
  private double counts[]; // will eventually contain averages, so it's double
  private final int NUMBER_OF_SIDES = 6; // constant, normal dies have 6 sides
  
  /**
   * Class constructor. Creates the counts array.
   */
  public RandomNumberTester() {
    counts = new double[ NUMBER_OF_SIDES ];
  } //RandomNumberTester()
  
  /**
   * Inititalizes the array to all zeros (resets the array).
   * @return void
   */
  public void init () {
    for ( int n=0 ; n < counts.length ; n++ )
      counts[n]=0;
  } //init()
  
  /**
   * Returns a string representation of the counts array.
   * @return String
   */
  public String toString() {
    String s = "";
    for ( int n=0 ; n < counts.length ; n++ )
      s += (n+1) + "=" + counts[n] + "\t"; // note the n+1 to make it a "real" die.
    return s;
  } //toString()
  
  /**
   * Rolls a die a specific number of times and records when numbers where
   * rolled in the counts array.
   * @param int nTrials
   * @return void
   */
  public void throwDie( int nTrials ) {
    
    for ( int n=0 ; n < nTrials ; n++ ) {
      int roll = (int)( Math.random() * counts.length );
      ++counts[roll];
    } //for
    
  } //throwDie()
  
  /**
   * This method actually runs the tests nExpiriments times with nTrials rolls per expiriment.
   * @param int nExpiriments
   * @param int nTrials
   * @return void
   */
  public void runExpiriment(int nExpiriments, int nTrials) {
    double countSum[] = new double[counts.length];
    
    // loop nExpiriments times
    for ( int n=0; n < nExpiriments; n++) {
      
      init(); // reset the counts array
      throwDie(nTrials); // roll the die
      
      // sum the results
      for ( int i=0; i < counts.length; i++) {
        countSum[i] += counts[i]; // this will get us the total sum
      }
      
      // average the total sums
      for ( int i=0; i < countSum.length; i++) {
        counts[i] = countSum[i]/nExpiriments; // I dont like how this overwrites counts
      }
    }
  } //runExpiriment()
  
  /**
   * This is the main method, which actually runs the progam.
   */
  public static void main(String args[]) {
    RandomNumberTester rand = new RandomNumberTester();
    
    int nExpiriments=100, nTrials=6;
    
    rand.runExpiriment(nExpiriments,nTrials); // run the expiriment... duh.
    
    // print the summary
    System.out.println("Results of " + nExpiriments + " expiriments with " + nTrials + " throws per expiriment.");
    // print the results
    System.out.println(rand.toString());
    
  } //main()
  
} // RandomNumberTester
