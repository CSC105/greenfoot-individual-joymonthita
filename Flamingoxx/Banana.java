import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gold_egg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Actor
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

    public Banana(){
        myImage.scale(52,67);
    }

    public void moveDown(){
        setLocation(getX(), getY() + 3);
        if(isTouching(Flamingo.class))
        {
            GreenfootSound Egg_sound = new GreenfootSound("Egg_sound.mp3");
            Egg_sound.setVolume(80);
            Egg_sound.play();
            myImage.setTransparency(0);
            int points = 10;
            MyWorld.updateScore(points);
            getWorld().removeObject(this);
        }

        else if(getY() >= 490)
        {
            getWorld().removeObject(this);
        }
    }
}
