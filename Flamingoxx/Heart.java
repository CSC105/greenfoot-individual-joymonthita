import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends Actor
{
    /**
     * Act - do whatever the Heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage myImage1 = new GreenfootImage("Heart/Miniheart1.png");
    GreenfootImage myImage2 = new GreenfootImage("Heart/Miniheart2.png");
    public void act() 
    {
        
    }    
    
    public Heart(){
        setImage(myImage1);
    }
   
}
