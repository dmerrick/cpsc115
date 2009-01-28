/*
 * File: LeapYearApplet.java
 * Author: Java Java Java (with modifications by Dana Merrick)
 * Description: This applet creates a LeapYearGUIPanel and 
 *  adds it to the applet's content pane. 
 */
import javax.swing.*;

public class LeapYearApplet extends JApplet 
{   public void init() 
    {    getContentPane().add(new LeapYearGUIPanel());
    }
}
