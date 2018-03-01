import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private Egg egg;
    private Bomb bomb;
    Flamingo flamingo = new Flamingo();
    Heart heart1 = new Heart();
    Heart heart2 = new Heart();
    Heart heart3 = new Heart();
    GreenfootImage blankHeart = new GreenfootImage("Heart/Miniheart2.png");
    GreenfootImage bang = new GreenfootImage("Effect/Bang.png");
    private int count = 3;
    Score score = new Score();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        GreenfootImage bg = new GreenfootImage("Background/Forest.png");
        bg.scale(700,500);
        setBackground(bg);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(flamingo,60,400);
        addObject(heart1, 40, 40);
        addObject(heart2, 89, 40);
        addObject(heart3, 137, 40);
        addObject(score, 630, 31);
    }

    public void act(){
        generateEgg();
        generateBomb();
    }

    public void generateEgg()
    {
        if(Greenfoot.getRandomNumber(500)<10){
            if(numberOfObjects() <= 7)
                addObject(new Egg() , Greenfoot.getRandomNumber(680) + 10, 50);
        }
    }

    public void generateBomb(){
        if(numberOfObjects() <= 5){
            addObject(new Bomb(), Greenfoot.getRandomNumber(680) + 10, 50);
        }
    }

    public void removeHeart()
    {
        if(count == 3){
            heart3.setImage(blankHeart);
            count--;
        }
        else if(count == 2){
            heart2.setImage(blankHeart);
            count--;
        }
        else if(count == 1){
            heart1.setImage(blankHeart);
            count--;
            Greenfoot.setWorld(new Game_over());
        }
        else
        {

        }

    }
    
    public Score getScore(){
        return score;
    }

}
