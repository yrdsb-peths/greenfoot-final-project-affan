import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    private Label score =  new Label(MyWorld.points, 20);
    private Label textScore = new Label("score:", 20);
    private Play restart = new Play();
    GameEnd over = new GameEnd();
    public GameOver()
    {    
        super(144, 256, 1, false);
        setBackground("background.png");
        addObject(over, 72, 128);
        addObject(textScore, 65,170);
        addObject(score, 97, 170);
        addObject(restart, 72, 200);
    }
    public void act(){
        if(Greenfoot.mouseClicked(restart) || Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("space")){
            Greenfoot.playSound("swoosh.mp3");
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
