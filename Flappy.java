import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flappy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flappy extends Actor
{
    private SimpleTimer timer;
    private GreenfootImage[] flapper;
    private boolean lastState;
    public Flappy(){
        flapper = new GreenfootImage[4];
        for (int i = 0; 3 > i; i++){
            flapper[i] = new GreenfootImage("sprites/bird_" + (i + 1) + ".png");
        }
        flapper[3] = new GreenfootImage("sprites/bird_2.png");
        setImage(flapper[0]);
        timer = new SimpleTimer();
        timer.mark();
    }
    
    int curIndex = 0;
    
    void anime(){
        if(timer.millisElapsed() > 170){
            setImage(flapper[curIndex]);
            curIndex++;
            curIndex %= 4;
            timer.mark();
        }
    }
    
    
    public void act()
    {
        if(getY() < 10){
            setLocation(getX(), 10);
        }
        if(Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 10);
        }
        setLocation(getX(), getY() + 5);
        anime();
    }
}
