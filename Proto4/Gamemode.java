import greenfoot.*;

/**
 * Write a description of class Gamemode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gamemode extends World
{

    /**
     * Constructor for objects of class Gamemode.
     * 
     */
    public Gamemode()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        BackButton backbutton = new BackButton();
        addObject(backbutton, 86, 538);
        SoloButton solobutton = new SoloButton();
        addObject(solobutton, 176, 425);
        solobutton.setLocation(168, 418);
        backbutton.setLocation(68, 542);
        ORButton orbutton = new ORButton();
        addObject(orbutton, 377, 418);
        orbutton.setLocation(364, 418);
        MultiplayerButton multiplayerbutton = new MultiplayerButton();
        addObject(multiplayerbutton, 608, 417);
        multiplayerbutton.setLocation(602, 422);
    }
}
