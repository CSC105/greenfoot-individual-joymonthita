import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamingo extends Actor
{
    /**
     * Act - do whatever the Fla wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int frameLeft = 0;
    private int frameRight = 0;
    GreenfootImage[] animationRight = new GreenfootImage[36];
    GreenfootImage[] animationLeft = new GreenfootImage[36];
    private boolean isRight;
    private boolean isWalking;
    private int count = 0;
    

    
    public Flamingo()
    {
       
        for(int i = 1; i <= 36; ++i)
        {
            animationRight[i-1] = new GreenfootImage("FlamingoRight/Flamingo"+ i +".png");
            animationLeft[i-1] = new GreenfootImage("FlamingoLeft/Flamingo"+ i +".png");
            animationRight[i-1].scale(90,150);
            animationLeft[i-1].scale(90,150);
        }
        setImage(animationRight[0]);
        isRight = true;
        isWalking = false;
    }

    public void act() 
    {
        checkKey();
        
        checkHeart();
    }

    public void checkKey()
    {
        isWalking = false;
        if(Greenfoot.isKeyDown("right"))
        {
            moveRight();
            setImage(animationRight[frameRight]);
            frameRight++;
            isRight = true;
            isWalking = true;
            if(frameRight == 36){
                frameRight = 0;
            }
        }else{
            frameRight = 0;
        }

        if(Greenfoot.isKeyDown("left"))
        {
            moveLeft();
            setImage(animationLeft[frameLeft]);
            frameLeft++;
            isRight = false;
            isWalking = true;
            if(frameLeft == 36){
                frameLeft = 0;
            }
        }else{
            frameLeft = 0;
        }

        if(!isWalking){
            if(isRight){
                setImage(animationRight[0]);
            }else{
                setImage(animationLeft[0]);
            }
        }

        
    }

    public void moveRight()
    {
        if(Greenfoot.isKeyDown("shift"))
        {
            setLocation(getX()+ 9, getY());
        }
        else
            setLocation(getX()+ 5, getY());
    }

    public void moveLeft()
    {
        if(Greenfoot.isKeyDown("shift"))
        {
            setLocation(getX() - 9, getY());
        }
        else
            setLocation(getX()- 5, getY());
    }

    public void animateRight(){
        for(int i = 1; i < 36; i++){
            if(frameRight==i)
            {
                setImage(animationRight[i]);
            }
        }
    }

    public void animateLeft(){
        for(int i = 1; i < 36; i++){
            if(frameLeft == i){
                setImage(animationLeft[i]);
            }
        }
    }

    public void checkHeart(){
        MyWorld world = (MyWorld)getWorld();
        //world.removeHeart();
        
    }
    


}
