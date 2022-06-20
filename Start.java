import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    private Play play = new Play();
    private Logo logo = new Logo();
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(144, 256, 1, false);
        setBackground("background.png");
        addObject(play, 72, 128);
        addObject(logo, 72, 90);
    }
    public void act(){
        if(Greenfoot.mouseClicked(play)){
            Greenfoot.playSound("swoosh.mp3");
            Greenfoot.playSound("music.mp3");
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
