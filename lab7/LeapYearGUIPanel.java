/*
 * File: LeapYearGUIPanel.java
 * Author: Java Java Java (with HEAVY modifications by Dana Merrick)
 * Description: This class builds and controls a GUI for the LeapYear class.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*; // for borders


public class LeapYearGUIPanel extends JPanel implements ActionListener 
{ 
  // declare some objects
  private JTextArea display;
  private JTextField inField;
  private JButton checkButton;
  private JButton clearButton;
  
  /**
   * The class constructor. Creates a new LeapYear object and builds the GUI.
   */
  public LeapYearGUIPanel() 
  { 
    buildGUI();
  } // LeapYearGUIPanel()
  
  
  /**
   * Builds the GUI, ending with asking the first question.
   */
  private void buildGUI() 
  { 
    // create the text objects
    display = new JTextArea(10,30);
    inField = new JTextField(10);
    display.setEditable(false);
    
    // create the buttons and add listeners
    checkButton = new JButton("Check Leap Year");
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
    inputPanel.setBorder(new TitledBorder("Inputs"));
    display.setBorder(new TitledBorder("Display"));
    controlPanel.setBorder(new TitledBorder("Controls"));
    
    // intro message
    display.append("This program will determine whether a year is a leap year.\n");
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
      int year = new Integer(inField.getText());
      if (LeapYear.isLeapYear(year)) {
        display.append(year + " is a leap year.\n");
      } else {
        display.append(year + " is not a leap year.\n");
      }
    } //checkButton
    
  } // actionPeformed()
  
} // LeapYearGUIPanel
