/*
 * File: CrosswordGUIPanel.java
 * Author: Java Java Java (with HEAVY modifications by Dana Merrick)
 * Description: This class builds and controls a GUI for the Crossword class.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*; // for borders


public class CrosswordGUIPanel extends JPanel implements ActionListener 
{ 
  // declare some objects
  private JTextArea display;
  private JTextField inField;
  private JButton goButton;
  private Crossword crossword; // computational object
  
  // new buttons
  private JButton hintButton;  
  private JButton playAgainButton;
  private JButton clearButton;
  
  /**
   * The class constructor. Creates a new Crossword object and builds the GUI.
   */
  public CrosswordGUIPanel() 
  { 
    crossword = new Crossword("What's my name?","Dana","It starts with D.");  
    buildGUI();
  } // CrosswordGUIPanel()
  
  
  /**
   * Builds the GUI, ending with asking the first question.
   */
  private void buildGUI() 
  { 
    // create the text objects
    display = new JTextArea(10,30);
    inField = new JTextField(10);
    //display.add(new JScrollBar());
    display.setEditable(false);
    
    // create the buttons and add listeners
    goButton = new JButton("Check My Guess");
    goButton.addActionListener(this);    
    hintButton = new JButton("Hint Please");
    hintButton.addActionListener(this);    
    playAgainButton = new JButton("Play Again?");
    playAgainButton.addActionListener(this);
    clearButton = new JButton("Clear");
    clearButton.addActionListener(this);
    
    // what if the user presses enter?
    inField.addActionListener(this);
    
    // this panel holds the input pane
    JPanel inputPanel = new JPanel();
    inputPanel.add(new JLabel("Input your guess here: "));
    inputPanel.add(inField);
    
    // this panel holds the buttons
    JPanel controlPanel = new JPanel();
    controlPanel.add(goButton);
    controlPanel.add(hintButton);  
    controlPanel.add(playAgainButton);
    controlPanel.add(clearButton);
    
    // set up the layout
    add("North", inputPanel); 
    add("Center", display);
    add("South", controlPanel);
    
    // add the labels for the various layouts
    inputPanel.setBorder(new TitledBorder("Inputs"));
    display.setBorder(new TitledBorder("Display"));
    controlPanel.setBorder(new TitledBorder("Controls"));
    
    // ask the first question
    display.append(crossword.getClue() + "\n"); // note that the question needs its own "?"
  } //buildGUI()
  
  
  /**
   * This method is called whenever an action (in this case button press) occurs.
   * It has an if statement for each of the buttons that could have sent the event.
   * @param ActionEvent e 
   */
  public void actionPerformed(ActionEvent e) 
  { 
    // was the goButton (or enter) pressed?
    if (e.getSource() == goButton || e.getSource() == inField)
    {
      String guess = inField.getText();
      if (crossword.isCorrectGuess(guess)) {
        display.append("You win! The answer was: " + crossword.getWord() + ".\n");
        playAgainButton.doClick();
      } else {
        display.append("Try again...\n");
      }
    } //goButton
    
    // was the hintButton pressed?
    if (e.getSource() == hintButton) {
      display.append(crossword.getHint() + "\n");
    } //hintButton
    
    // was the clearButton pressed?
    if (e.getSource() == clearButton) {
      display.setText("");  // clear the text area
    } //clearButton
    
    // was the playAgainButton pressed?
    if (e.getSource() == playAgainButton) {
      display.append("Starting a new game!\n");               // tell the user
      crossword = new Crossword("What's your name?","Ralph","It starts with R."); // create a new object
      display.append(crossword.getClue() + "\n");             // give the clue
    } //playAgainButton
    
  } // actionPeformed()
  
} // CrosswordGUIPanel
