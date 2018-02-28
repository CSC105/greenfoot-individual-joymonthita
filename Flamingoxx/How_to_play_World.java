import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class How_to_play_World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class How_to_play_World extends World
{
    GreenfootImage main = new GreenfootImage("How_to_play/How_to_play.png");
    private Back back = new Back();
    /**
     * Constructor for objects of class How_to_play_World.
     * 
     */
    public How_to_play_World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        setBackground(main);
        prepare();
    }
    
    public void prepare(){
        addObject(back, 660, 460);
    }
}
