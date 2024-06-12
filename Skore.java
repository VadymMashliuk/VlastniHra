import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Objects;

/**
 * Write a description of class Skore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skore extends Actor
{
    public void act()
    {
        MyWorld svet;
        svet = (MyWorld) getWorld();
        GreenfootImage img;
        img = new GreenfootImage("Skóre: " + svet.skore, 33, Color.BLUE, Color.BLACK);
        setImage(img);
    }
}
