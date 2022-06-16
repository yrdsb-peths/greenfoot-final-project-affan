import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PillarUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PillarUp extends Actor
{
    /**
     * Act - do whatever the PillarUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PillarUp(){
        setImage("pillar_up.png");
    }
    public void act()
    {
        move(-2);
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Flappy.class)){
            world.gameOver();
            world.removeObject(this);
        }
    }
}
