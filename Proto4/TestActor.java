import greenfoot.*;

/**
 * Write a description of class TestActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestActor extends Actor
{
    /**
     * Act - do whatever the TestActor wants to do. This method is called whenever
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
