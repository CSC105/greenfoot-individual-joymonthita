import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    GreenfootImage myImage = getImage();
    private GreenfootImage bang = new GreenfootImage("Effect/Bang.png");
    private boolean banged;
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkTouch();
        moveDown();
        
    }  

    public Bomb(){
        banged = false;
        myImage.scale(55,55);
        bang.scale(100,100);
    }

    public void moveDown(){
        setLocation(getX(), getY() + 3);
        if(getY() >= 380 && banged)
        {
            bang.setTransparency(0);
        }
        
        if(getY() >= 490)
        {
           getWorld().removeObject(this);
        }
        
        
    }
    
    public void checkTouch(){
        MyWorld world = (MyWorld)getWorld();
        Actor flamingo = (Actor)world.getObjects(Flamingo.class).get(0);
        if(Math.abs(flamingo.getX() - getX()) <= 40 && !banged)
        {
            if(Math.abs(flamingo.getY() - getY()) <= 40)
            {
                this.setImage(bang);
                banged = true;
                world.removeHeart();
            }
        }
    }
    
    

}
