import greenfoot.*;

/**
 * Write a description of class FinishLine1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinishLine1 extends FallingObjects
{
    /**
     * Act - do whatever the FinishLine1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.fall();
        if (getWorld() != null && this.getY() == 590)
        {
           //getWorld().removeObjects(getWorld().getObjects(this));
        }
    }    
}
