/*
 * File: PaceCalculatorGUIPanel.java
 * Author: Dana Merrick
 * Description: This class builds and controls a GUI for the PaceCalculator class.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*; // for borders


public class PaceCalcGUIPanel extends JPanel implements ActionListener 
{ 
  // declare some objects
  private JTextField inputHours,inputMinutes,inputSeconds,inputMiles;
  private JTextArea display;
  private JButton calculateButton,convertButton;
  
  private PaceCalculator paceCalculator; // computational object
  
  /**
   * The class constructor. Builds the GUI.
   */
  public PaceCalcGUIPanel() 
  { 
    buildGUI();
  } // PaceCalcGUIPanel()
  
  
  /**
   * Builds the GUI, ending with asking the first question.
   */
  private void buildGUI() 
  { 
    // create the input objects
    inputHours = new JTextField("0",5);
    inputMinutes = new JTextField("0",5);
    inputSeconds = new JTextField("0",5);
    inputMiles = new JTextField("0",5);
     
    display = new JTextArea(10,30);
    display.setEditable(false);
    
    // create the buttons and add listeners
    calculateButton = new JButton("Minutes Per Mile");
    calculateButton.addActionListener(this);    
    convertButton = new JButton("Convert Km In Miles Field To Miles");
    convertButton.addActionListener(this);   
    
    // what if the user presses enter?
    inputHours.addActionListener(this);
    inputMinutes.addActionListener(this);
    inputSeconds.addActionListener(this);
    inputMiles.addActionListener(this);
    
    // this panel holds the input pane
    JPanel inputPanel = new JPanel();
    inputPanel.add(new JLabel("Hours: "));
    inputPanel.add(inputHours);
    inputPanel.add(new JLabel("Minutes: "));
    inputPanel.add(inputMinutes);
    inputPanel.add(new JLabel("Seconds: "));
    inputPanel.add(inputSeconds);
    inputPanel.add(new JLabel("Miles: "));
    inputPanel.add(inputMiles);
    
    // this panel holds the buttons
    JPanel controlPanel = new JPanel();
    controlPanel.add(calculateButton);
    controlPanel.add(convertButton);  
    
    // set up the layout
    add("North", inputPanel); 
    add("Center", display);
    add("South", controlPanel);
    
    // add the labels for the various layouts
    inputPanel.setBorder(new TitledBorder("Inputs"));
    display.setBorder(new TitledBorder("Display"));
    controlPanel.setBorder(new TitledBorder("Controls"));
    
  } //buildGUI()
  
  
  /**
   * This method is called whenever an action (in this case button press) occurs.
   * It has an if statement for each of the buttons that could have sent the event.
   * @param ActionEvent e 
   */
  public void actionPerformed(ActionEvent e) 
  { 
    // was the calculateButton (or enter) pressed?
    if (e.getSource() == calculateButton || 
        e.getSource() == inputHours || 
        e.getSource() == inputMinutes || 
        e.getSource() == inputSeconds ||  
        e.getSource() == inputMiles )
    {      
      int hours = new Integer(inputHours.getText());
      int minutes = new Integer(inputMinutes.getText());
      int seconds = new Integer(inputSeconds.getText());
      double miles = new Double(inputMiles.getText());
      
      paceCalculator = new PaceCalculator(hours,minutes,seconds,miles); 
      display.append("Your Pace: " + paceCalculator.minsPerMile() + " minutes per mile.\n");
      
    } //calculateButton
    
    // was the convertButton pressed?
    if (e.getSource() == convertButton) {
      double kilometers = new Double(inputMiles.getText());
      
      // lets use the static method
      inputMiles.setText( Double.toString( PaceCalculator.kmToMiles(kilometers) ) );
      
    } //convertButton
    
  } // actionPeformed()
  
} // PaceCalcGUIPanel
