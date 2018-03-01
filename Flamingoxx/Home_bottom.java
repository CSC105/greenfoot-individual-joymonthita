import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home_bottom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home_bottom extends Actor
{
    GreenfootImage home = getImage();
    /**
     * Act - do whatever the Home_bottom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.getMouseInfo() != null && Greenfoot.mousePressed(this)){
            ((Game_over)(getWorld())).stopped();
            Greenfoot.setWorld(new Home());
        }
    }  
    
    public void Home_bottom(){
         home.scale(320,370);
    }
}
