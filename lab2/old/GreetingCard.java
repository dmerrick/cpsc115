/*
 * File: GreetingCard.java
 * Author: Java Java Java
 * Description: Represents a greeting card, including a greeting and a drawing.
 */
import java.awt.*;

public class GreetingCard
{
    // Instance variables
    private String typeOfCard;
    private String greeting;
    private CardDrawing drawing;

    public GreetingCard(String type, String msg, CardDrawing picture) 
    {
        typeOfCard = type;
        greeting = msg;
        drawing = picture;
    } // GreetingCard()
   
    public String greet()
    {
        return greeting;
    } // greet()

    public void paintYourself(Graphics g, int left, int top)
    {
      drawing.myPaint(g, left, top);    
      g.drawString(greet(), left, top - 10);
    } // paintYourself()

} // GreetingCard
