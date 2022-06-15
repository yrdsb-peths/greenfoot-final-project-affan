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
    private Flappy flap;
    private PillarUp pillarU;
    private PillarDown pillarD;
    private SimpleTimer pill;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(144, 256, 1, false);
        setBackground("background.png");
        flap = new Flappy();
        pillarU = new PillarUp();
        pillarD = new PillarDown();
        pill = new SimpleTimer();
        addObject(flap, 72, 128);
        pill.mark();
    }
    public void act(){
        if(pill.millisElapsed() > 1000){
            pillarSpawn();
        }
        if(pill.millisElapsed() > 2500){
            removeObject(pillarU);
            removeObject(pillarD);
            pill.mark();
        }
        
    }
    public void pillarSpawn(){
        int y = (246+ Greenfoot.getRandomNumber(70));
        addObject(pillarU, 160, y);
        addObject(pillarD, 160, y - 230);
    }
}
