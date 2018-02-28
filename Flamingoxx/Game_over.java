import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game_over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game_over extends World
{
    GreenfootImage main = new GreenfootImage("Game_over/Game_over.png");
    private Play_again play_again = new Play_again();
    private Home_bottom home_bottom  = new Home_bottom();
    /**
     * Constructor for objects of class Game_over.
     * 
     */
    public Game_over()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        setBackground(main);
        prepare();
    }

    public void prepare(){
        addObject(play_again, 240, 380);
        addObject(home_bottom, 470, 383);
    }
}
