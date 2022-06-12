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
    private PillarUp pillar;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(144, 256, 1, false);
        setBackground("background.png");
        flap = new Flappy();
        pillar = new PillarUp();
        addObject(flap, 72, 128);
        pillarSpawn();
    }
    public void pillarSpawn(){
        addObject(pillar, 160, (246+ Greenfoot.getRandomNumber(70)));
    }
}
