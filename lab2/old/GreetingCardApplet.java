/*
 * File: GreetingCardApplet.java
 * Author: Java Java Java
 * Description: Displays a greeting card.
 */
import java.awt.*;
import java.applet.*;
import java.net.*;

public class GreetingCardApplet  extends Applet
{   
    /** 
     * paint() is called automatically when the applet starts. It displays a greeting card.
     */
    public void paint(Graphics g)
    {   
      
 GreetingCard mycard = new GreetingCard("You did it!", "Your applet worked!", new MyDrawing());
 mycard.paintYourself(g, 10, 40);
 
    } // paint()
} //  GreetingCardApplet
