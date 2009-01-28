/*
 * File: PrimesGUIPanel.java
 * Author: Java Java Java (with HEAVY modifications by Dana Merrick)
 * Description: This class builds and controls a GUI for the PrimeFinder class.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*; // for borders


public class PrimesGUIPanel extends JPanel implements ActionListener 
{ 
  // declare some objects
  private JTextArea display;
  private JTextField inField;
  private JButton checkButton;
  private JButton clearButton;
  private PrimeFinder prime; //computational object
  
  /**
   * The class constructor. Creates a new PrimeFinder object and builds the GUI.
   */
  public PrimesGUIPanel() 
  { 
    prime = new PrimeFinder();
    buildGUI();
  } // PrimesGUIPanel()
  
  
  /**
   * Builds the GUI, ending with the intro message.
   */
  private void buildGUI() 
  { 
    // create the text objects
    display = new JTextArea(10,30);
    inField = new JTextField(10);
    display.setEditable(false);
    
    // create the buttons and add listeners
    checkButton = new JButton("Find Primes");
    checkButton.addActionListener(this);    
    
    // what if the user presses enter?
    inField.addActionListener(this);
    
    // this panel holds the input pane
    JPanel inputPanel = new JPanel();
    inputPanel.add(inField);
    
    // this panel holds the buttons
    JPanel controlPanel = new JPanel();
    controlPanel.add(checkButton);
    
    // this panel holds the display
    JPanel displayPanel = new JPanel();
    displayPanel.add(display);
    // add scrollbars
    displayPanel.add(new JScrollPane(display,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
        
    // set up the layout
    add("North", inputPanel); 
    add("Center", displayPanel);
    add("South", controlPanel);
    

    // add the labels for the various layouts
    inputPanel.setBorder(new TitledBorder("Inputs"));
    displayPanel.setBorder(new TitledBorder("Display"));
    controlPanel.setBorder(new TitledBorder("Controls"));
    
    // intro message
    display.append("This program will find all primes less than or equal to N.\n");
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
      int number = new Integer(inField.getText());
      display.append("The primes between 1 and " + number + " are:\n");
      display.append( prime.getPrimesLessEqualN(number) + "\n");
    } //checkButton
    
  } // actionPeformed()
  
} // PrimesGUIPanel
