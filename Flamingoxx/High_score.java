import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class High_score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class High_score extends Actor
{
    GreenfootImage high_score = getImage();
    /**
     * Act - do whatever the High_score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.getMouseInfo() != null && Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new MyWorld());
        }
    }   
    
    public High_score(){
        high_score.scale(350,400);
    }
}
