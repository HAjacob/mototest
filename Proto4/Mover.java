import greenfoot.*;

/**
 * Write a description of class mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mover extends Actor
{
    public int velX = 0;
    public int velY = 0;
    private static final int acceleration = 2;      // down (gravity)
    private static final int speed = 3;             // running speed (sideways)
    
    private int vSpeed = 0;                         // current vertical speed
    

    public void moveRight()
    {
        setLocation ( getX()+3, getY() );
    }
    
    public void moveLeft()
    {
        setLocation ( getX()-3, getY() );
    }
    
    public void moveDown()
    {
        setLocation ( getX(), getY() + 2 );
    }
        
    public void moveUp()
    {
        setLocation ( getX(), getY() - 2 );
    }
    
    public boolean onGround()
    {
        Object under = getOneObjectAtOffset(0, getImage().getHeight()/2-8 , null);
        return under != null;
    }

    public void setVSpeed(int speed)
    {
        vSpeed = speed;
    }
    
    private void gameEnd()
    {
        Greenfoot.stop();
    }
  

   
}

