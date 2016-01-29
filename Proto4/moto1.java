import greenfoot.*;

/**
 * Write a description of class moto1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class moto1 extends Mover

 {
    /**
     * Act - do whatever the moto1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound sound = new GreenfootSound("engine_4.wav");
    public void act()  
    {
        checkKeys();
        setLocation(getX()+(velX),getY()+(velY));
        Border();
        Border1();
        if(sound.isPlaying())
        {
            sound.stop();
        }
            else 
            {
               sound.play(); 
            }
        
        
    }
    //checks to see which keys are pressed
    
        private void checkKeys()
    {
        if (Greenfoot.isKeyDown("d") )
        {
           /*
            * 
            *setImage("Plyr1_Right.png");
            *moveRight();
            */
           moveRight();
           turn(30);
           setRotation(30);
        }
        else if (Greenfoot.isKeyDown("a") )
        {
            //setImage("Plyr1_Left.png");
           moveLeft();
           turn(-30);
           setRotation(-30);
          
        }
        else
        {
        turn(0);
        setRotation(0);
        Greenfoot.playSound("engine_4.wav");
    }
        if (Greenfoot.isKeyDown("w") )
        {
            moveUp();
        }
                if (Greenfoot.isKeyDown("s") )
        {
            //moveDown();
        }
             {
        if(isTouching(TestProblem.class))
        {
            Greenfoot.stop();
        }
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
    





