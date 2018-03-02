import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class How_to_play_World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class How_to_play_World extends World
{
    GreenfootImage main = new GreenfootImage("How_to_play/How_to_play_2.png");
    GreenfootSound How_to_play_sound = new GreenfootSound("Home_sound.mp3");
    private Back back = new Back();
    boolean start = true;
    public boolean end = false;
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
        How_to_play_sound.setVolume(80);
    }
    
    public void prepare(){
        addObject(back, 660, 460);
    }
    
    public void act(){
        if(start){
            How_to_play_sound.playLoop();
            start = false;
        }
        if(end == true){
            stopped();
        }else{
            How_to_play_sound.playLoop();
        }
    }
    
    public void stopped(){
         How_to_play_sound.stop();
    }
}
