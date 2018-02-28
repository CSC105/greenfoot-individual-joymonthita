import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Actor
{
    GreenfootImage play = getImage();
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.getMouseInfo() != null && Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new MyWorld());
        }
    } 
    
    public Play(){
        play.scale(350,400);
    }
  
}
