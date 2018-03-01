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
    GreenfootSound Game_over = new GreenfootSound("Game_over.mp3");
    private Play_again play_again = new Play_again();
    private Home_bottom home_bottom  = new Home_bottom();
    private Score score = new Score();
    boolean start = true;
    public boolean end = false;
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
        Game_over.setVolume(70);
    }

    public void act(){
        if(start){
            Game_over.playLoop();
            start = false;
        }
        if(end == true){
            stopped();
        }else{
            Game_over.playLoop();
        }
    }

    public void prepare(){
        addObject(play_again, 240, 380);
        addObject(home_bottom, 470, 380);
        addObject(score, 350, 100);
    }
    
    public void stopped(){
         Game_over.stop();
    }
}
