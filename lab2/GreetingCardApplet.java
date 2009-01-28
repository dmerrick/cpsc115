/*
 * File: GreetingCardApplet.java
 * Author: Java Java Java (with some changes by Dana Merrick)
 * Description: Displays a greeting card.
 */
import java.awt.*;
import java.applet.*;
import java.net.*;

public class GreetingCardApplet  extends Applet
{   
    /** 
     * paint() is called automatically when the applet starts. It displays a greeting card.
     * @param g is a Graphics object that does the painting.
     */
    public void paint(Graphics g)
    {    
        GreetingCard mycard = new GreetingCard("Thank you", "Thanks!"); // I changed these slightly
        mycard.paintYourself(g, 0, 0);
    } // paint()
} //  GreetingCardApplet
