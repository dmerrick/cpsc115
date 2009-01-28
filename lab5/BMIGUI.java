/*
 * File: BMIGui.java
 * Author: Java Java Java (with changes by Dana Merrick)
 * Description: This class provides a graphical user interface for
 *  a BMI application.  The computational object is a BMICalculator.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMIGUI extends JFrame implements ActionListener 
{   private JTextArea display;
    private JTextField hField, wField;
    private JButton goButton;
    private BMICalculator newBMI;         // Computation object
     
    public BMIGUI(String title) 
    {  
        buildGUI();
        setTitle(title);
        pack();
        setVisible(true);
    } // BMIGUI()

    private void buildGUI() 
    {   Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        display = new JTextArea(10,30);
        hField = new JTextField(10);
        wField = new JTextField(10);
        goButton = new JButton("Calculate BMI");
        goButton.addActionListener(this);
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Input your height here: "));
        inputPanel.add(hField);
        inputPanel.add(new JLabel("Input your weight here: "));
        inputPanel.add(wField);
        inputPanel.add(goButton);
        contentPane.add("Center", display);
        contentPane.add("South", inputPanel);
        
        // intro message
        display.append("This program will calculate your Body Mass Index.\n");
        display.append("In pounds and inches. BMI = (Wgt/(Hgt * Hgt) * 703)\n");
    } // buildGUI()

    public void actionPerformed(ActionEvent e) 
    {   if (e.getSource() == goButton) 
        {
         newBMI = new BMICalculator(Double.valueOf(hField.getText()),Double.valueOf(wField.getText()));
         display.append("Your BMI is: " + newBMI.getBMI() + ".\n");
         display.append("Your BMI suggests your weight is: " + newBMI.rateBMI() + ".\n");
        }
    } // actionPerformed()
} // BMIGUI
