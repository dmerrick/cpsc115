/*
 * File: GreetingCard.java
 * Author: Dana Merrick
 * Course: CPSC 115 Tuesday
 * Description: A simple applet.
 */

import java.awt.*;     // Import all windowing classes including Graphics

public class GreetingCard
{
   private String greeting;
   private String cardType;

    public GreetingCard(String type, String msg) 
    {
      cardType = type;
      greeting = msg;
    }
   
    /**
     * Prints a greeting.
     * @author Dana Merrick
     */
    public String greet()
    {
        return greeting;
    } // greet()


    /**
     * This method tells the object how to paint itself.
     * @param g is the Graphics object
     * @param left x coordinate
     * @param top y coordiate
     */
    public void paintYourself(Graphics g, int left, int top)
    {
      //Background
      g.setColor(Color.red);
      g.fillRect(left,top,150,150);
      
      //First Circle
      g.setColor(Color.white);
      g.fillOval(left+10,top+10,130,130);
      g.setColor(Color.black);
      g.drawOval(left+10,top+10,130,130);
      
      //Second Circle
      g.setColor(Color.red);
      g.fillOval(left+20,top+20,110,110);
      g.setColor(Color.black);
      g.drawOval(left+20,top+20,110,110);
      
      //Third Circle
      g.setColor(Color.white);
      g.fillOval(left+30,top+30,90,90);
      g.setColor(Color.black);
      g.drawOval(left+30,top+30,90,90);
      
      //Text
      g.setColor(Color.black);
      g.drawString(greet(), left+60, top+75); // this is ugly...
      // long messages dont look good here.

    } // paintYourself()

} // GreetingCard
