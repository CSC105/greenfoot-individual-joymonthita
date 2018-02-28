import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{
    GreenfootImage main = new GreenfootImage("Background/Home.png");
    private Play play = new Play();
    private How_to_play how_to_play = new How_to_play(); 
    private High_score high_score = new High_score();
    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        main.scale(700,500);
        setBackground(main);
        prepare();
    }
    
    private void prepare(){
        addObject(play, 293, 298);
        addObject(how_to_play, 151, 461);
        addObject(high_score, 536, 426);
    }
}
