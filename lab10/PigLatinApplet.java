/*
 * File: PigLatinApplet.java
 * Author: Java Java Java (with modifications by Dana Merrick)
 * Description: This applet creates a PigLatinGUIPanel and 
 *  adds it to the applet's content pane. 
 */
import javax.swing.*;

public class PigLatinApplet extends JApplet 
{   public void init() 
    {    getContentPane().add(new PigLatinGUIPanel());
    }
}
