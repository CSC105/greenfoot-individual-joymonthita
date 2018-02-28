import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class How_to_play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class How_to_play extends Actor
{
    GreenfootImage how_to_play = getImage();
    /**
     * Act - do whatever the How_to_play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.getMouseInfo() != null && Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new MyWorld());
        }
    } 
    
    public How_to_play(){
        how_to_play.scale(350,400);
    }
}
