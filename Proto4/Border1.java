import greenfoot.*;

/**
 * Write a description of class Border here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Border1 extends Actor
{
   /**
     * Act - do whatever the Road_2Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage gifImage = new GifImage("Border1.gif");
    
    public void act() 
    {
       setImage( gifImage.getCurrentImage());
       
    }    
    
}
