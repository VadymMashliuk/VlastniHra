import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obtiznost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obtiznost extends Actor
{
    public void act()
    {
        MyWorld svet;
        svet = (MyWorld) getWorld();
        GreenfootImage img;
        img = new GreenfootImage("Obtížnost: " + svet.obtiznostValue, 33, Color.BLUE, Color.BLACK);
        setImage(img);
    }
}
