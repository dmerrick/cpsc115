/*
 * File: PrimesApplet.java
 * Author: Java Java Java (with modifications by Dana Merrick)
 * Description: This applet creates a PrimesGUIPanel and 
 *  adds it to the applet's content pane. 
 */
import javax.swing.*;

public class PrimesApplet extends JApplet 
{   public void init() 
    {    getContentPane().add(new PrimesGUIPanel());
    }
}
