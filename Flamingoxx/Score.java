import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    GreenfootImage image = new GreenfootImage(100, 50);
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        makeSB();
    }    
    
    public void makeSB(){
        String score = MyWorld.getScore();
        image.clear();
        image.setColor(Color.WHITE);
        image.drawString("Score: ", 1, 30);
        image.drawString(score,65,31);
        image.setFont(image.getFont().deriveFont(20f));
        setImage(image);
    }
}
