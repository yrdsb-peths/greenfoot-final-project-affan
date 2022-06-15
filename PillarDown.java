import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PillarDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PillarDown extends Actor
{
    /**
     * Act - do whatever the PillarDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PillarDown(){
        setImage("pillar_down.png");
    }
    public void act()
    {
        move(-2);
        if(isTouching(Flappy.class)){
            removeTouching(Flappy.class);
            MyWorld world = (MyWorld) getWorld();
        }
    }
}
