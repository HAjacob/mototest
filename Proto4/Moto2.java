import greenfoot.*;

/**
 * Write a description of class moto1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moto2 extends Mover
{
    /**
     * Act - do whatever the moto1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys(); 
        Border();
        Border1();
    }
    //checks to see which keys are pressed
    
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("right") )
        {
            setImage("Plyr2_Right.png");
            moveRight();
            //
        }
        else if (Greenfoot.isKeyDown("left") )
        {
            setImage("Plyr2_Left.png");
            moveLeft();
        }
        else
        {
        setImage("MotocrossPlayer2_InMotion.png");
    }
                if (Greenfoot.isKeyDown("up") )
        {
            moveUp();
        }
                if (Greenfoot.isKeyDown("down") )
        {
            //moveDown();
        }
}
      public void Border()
    {
        if(isTouching(grass.class))
        {
        moveRight();
        
    }
    
}
public void Border1()
{
    if(isTouching(grass1.class))
    {
        moveLeft();
        
    }
}


}
