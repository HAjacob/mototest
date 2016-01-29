import greenfoot.*;

/**
 * Write a description of class FallingObjects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FallingObjects extends Actor
{
    private int dropSpeed=2;
public boolean onBottom=false;
    public void act()
{
fall();
}
public void fall()
{
   if (!onBottom){
    this.setLocation(getX(),getY()+dropSpeed);
    onBottom=checkBottom();
}
}
public boolean checkBottom()
{
    if(getY()>570){
        return true;
    }
    else{
        return false;
    }
}
}