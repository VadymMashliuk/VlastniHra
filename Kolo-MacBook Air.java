import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kolo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kolo extends Actor
{
    /**
     * Act - do whatever the Kolo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Kolo()
    {
        GreenfootImage img = new GreenfootImage(getImage());
        img.scale(512/9, 512/9); 
        setImage(img);
    }
        turn(-90);
    }
    public void act()
    {
        // Add your action code here.
        move(4);
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
