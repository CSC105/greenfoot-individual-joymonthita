import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Actor
{
    GreenfootImage play = getImage();
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.getMouseInfo() != null && Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new Home());
        }
    }    
    
    public Back(){
        play.scale(55,55);
    }
}
