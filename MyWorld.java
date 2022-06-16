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
    private Floor floor;
    public int scr;
    public Label score =  new Label(scr, 20);
    public Label textScore = new Label("score:", 20);
    public static int points;
    private GetReady ready = new GetReady();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(144, 256, 1, false);
        Start world = new Start();
        Greenfoot.setWorld(world);
        scr = 0;
        setBackground("background.png");
        floor = new Floor();
        flap = new Flappy();
        pillarU = new PillarUp();
        pillarD = new PillarDown();
        pill = new SimpleTimer();
        addObject(score, 56, 19);
        addObject(textScore, 23, 19);
        addObject(flap, 72, 128);
        addObject(ready, 72, 128);
        pill.mark();
    }
    public void act(){
        if(pill.millisElapsed() > 500){
            removeObject(ready);
        }
        if(pill.millisElapsed() > 1000){
            removeObject(floor);
            pillarSpawn();
            addObject (floor, 72, 256);
        }
        if(pill.millisElapsed() > 2500){
            removeObject(pillarU);
            removeObject(pillarD);
            pill.mark();
            scr++;
            score.setValue(scr);
        }
        
    }
    public void pillarSpawn(){
        int y = (200 + Greenfoot.getRandomNumber(70));
        addObject(pillarU, 160, y);
        addObject(pillarD, 160, y - 230);
    }
    public void gameOver(){
        points = scr;
        GameOver world = new GameOver();
        Greenfoot.setWorld(world);
    }
    public int getScore(){
        return scr;
    }
}
