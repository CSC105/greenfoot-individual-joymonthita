import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play_again here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play_again extends Actor
{
    GreenfootImage play_again = getImage();
    /**
     * Act - do whatever the Play_again wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.getMouseInfo() != null && Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new MyWorld());
        }
    }    
    
    public Play_again(){
        play_again.scale(350,400);
    }
}
