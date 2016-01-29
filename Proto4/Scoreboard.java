import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    /**
     * This creates the scoreboard. Nothing else.
     */
    public Scoreboard(String player1, String player2)
    {
       GreenfootImage img = new GreenfootImage(800,40);
       img.setColor(Color.WHITE);
       Font font = new Font("Helvetica",Font.BOLD,20);
       img.setFont(font);
       img.drawString(player1,100,35);
       img.drawString(player2,450,35);
       setImage(img);
    }
}