import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Egg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Egg extends Actor
{
    GreenfootImage myImage = getImage();

    /**
     * Act - do whatever the Egg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveDown();
    }   

    public Egg(){
        myImage.scale(85,85);
    }

    public void moveDown(){
        setLocation(getX(), getY() + 3);
        if(getY() >= 490){
            getWorld().removeObject(this);
        }
    }

}
