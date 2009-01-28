/*
 * File: ThankYouDrawing.java
 * Author: Java Java Java
 * Description: This subclass of CardDrawing draws a picture for a thank you card.
 */
import java.awt.*;

public class ThankYouDrawing extends CardDrawing  // a subclass of CardDrawing
{
    /**
     * This method tells the object how to paint itself relative to its (left,top) coordinate.
     * @param g is the Graphics object where the painting will appear
     * @param left is the x coordinate
     * @param top is the y coordiate
     */
    public void paintYourself(Graphics g, int left, int top) 
    {   
        g.setColor(Color.blue);                  // Set the pen color to blue
        g.fillRect(left, top, 140, 100);         // Paint a 140 by 100 rectangle
	g.setColor(Color.cyan);                  // Set the pen color to cyan
	g.fillRect(left+2, top+2, 136, 96);      // Paint a smaller cyan rectangle
        g.setColor(Color.green);                 // Set the pen color to green
	g.fillOval(left+2, top+2, 134, 94);      // Paint a green oval 
        g.setColor(Color.yellow);                // Change the pen color to yellow
        g.fillOval(left+12, top+12, 116, 76);    // Paint a yellow oval
        g.setColor(Color.red);                   // Change the pen color to red
        g.drawOval(left+20, top+20, 100, 60);    // Draw a red oval outline
        g.setColor(Color.black);                 // Change the pen to black
	g.drawString("Thank you!", left + 40, top + 50);  // Write the message
    } // paintYourself()
} // ThankYouDrawing
