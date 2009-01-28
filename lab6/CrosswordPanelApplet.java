/*
 * File: CrosswordPanelApplet.java
 * Author: Java Java Java (with modifications by Dana Merrick)
 * Description: This applet creates a CrosswordGUIPanel and 
 *  adds it to the applet's content pane. 
 */
import javax.swing.*;

public class CrosswordPanelApplet extends JApplet 
{   public void init() 
    {    getContentPane().add(new CrosswordGUIPanel());
    }
}
