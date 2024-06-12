import greenfoot.*;

/**
 * Write a description of class Naboje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Naboje extends Actor
{
    public Naboje(){
        GreenfootImage img = new GreenfootImage(getImage());
        img.scale(512/9, 512/9); 
        setImage(img);
    }
}
