import greenfoot.*;

/**
 * Write a description of class Road_1Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road_1Player extends Actor
{
    /**
     * Act - do whatever the Road_1Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   GifImage gifImage = new GifImage("Road_1Player.gif");
    
    public void act() 
    {
       setImage( gifImage.getCurrentImage());
    }    
}
