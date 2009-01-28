/*
 * File: PaceCalculatorPanelApplet.java
 * Author: Java Java Java (with modifications by Dana Merrick)
 * Description: This applet creates a PaceCalcGUIPanel and 
 *  adds it to the applet's content pane. 
 */
import javax.swing.*;

public class PaceCalculatorApplet extends JApplet 
{   public void init() 
    {    getContentPane().add(new PaceCalcGUIPanel());
    }
}
