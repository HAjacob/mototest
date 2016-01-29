import greenfoot.*;

/**
 * Write a description of class MultiplayerButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MultiplayerButton extends Actor
{
    /**
     * Act - do whatever the MultiplayerButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))
     {
      Greenfoot.setWorld(new Road());
    }    
    }    
}
