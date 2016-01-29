import greenfoot.*;

/**
 * Write a description of class Road1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road1 extends World
{

    /**
     * Constructor for objects of class Road1.
     * 
     */
    public Road1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(473, 640, 1);
        

        prepare();
    }
    public void act()
    {
        
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        addObject ( new Road_1Player(), 236, 319);

        moto1 moto1 = new moto1();
        addObject(moto1, 244, 528);
        moto1.setLocation(235, 525);
    }
}
