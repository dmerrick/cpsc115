/*
 * File: PigLatinGUIPanel.java
 * Author: Java Java Java (with HEAVY modifications by Dana Merrick)
 * Description: This class builds and controls a GUI for the PigLatin class.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*; // for borders


public class PigLatinGUIPanel extends JPanel implements ActionListener 
{ 
  // declare some objects
  private JTextArea display;
  private JTextField inField;
  private JButton checkButton;
  private JButton clearButton;
  private PigLatin pig;
  
  /**
   * The class constructor. Creates a new PigLatin object and builds the GUI.
   */
  public PigLatinGUIPanel() 
  { 
    buildGUI();
    pig = new PigLatin();
  } // PigLatinGUIPanel()
  
  
  /**
   * Builds the GUI, ending with asking the first question.
   */
  private void buildGUI() 
  { 
    // create the text objects
    display = new JTextArea(10,30);
    inField = new JTextField(30);
    display.setEditable(false);
    
    // create the buttons and add listeners
    checkButton = new JButton("Translate!");
    checkButton.addActionListener(this);    
    
    // what if the user presses enter?
    inField.addActionListener(this);
    
    // this panel holds the input pane
    JPanel inputPanel = new JPanel();
    inputPanel.add(inField);
    
    // this panel holds the buttons
    JPanel controlPanel = new JPanel();
    controlPanel.add(checkButton);
    
    // set up the layout
    add("North", inputPanel); 
    add("Center", display);
    add("South", controlPanel);
    
    // add the labels for the various layouts
    inputPanel.setBorder(new TitledBorder("Input a sentence and press RETURN"));
    display.setBorder(new TitledBorder("Display"));
    controlPanel.setBorder(new TitledBorder("Or click this!"));
    
  } //buildGUI()
  
  
  /**
   * This method is called whenever an action (in this case button press) occurs.
   * It has an if statement for each of the buttons that could have sent the event.
   * @param ActionEvent e 
   */
  public void actionPerformed(ActionEvent e) 
  { 
    // was the checkButton (or enter) pressed?
    if (e.getSource() == checkButton || e.getSource() == inField)
    {
      String phrase = inField.getText();
      if (phrase.length() != 0) {
        display.append(pig.translate(phrase) +"\n");
      } else {
        display.append("Uh oh! You didn't enter anything!\n");
      }
    } //checkButton
    
  } // actionPeformed()
  
} // PigLatinGUIPanel
