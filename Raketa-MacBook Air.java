import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Raketa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Raketa extends Actor
{
    public void act()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 2);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 2);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 2, getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 2, getY());
        }
        
        int prebijeniMax = 100;
        int prebijeni = 0;
        String klavesa = Greenfoot.getKey();
        if ("space".equals(klavesa) && prebijeni <= 0)
        {
            getWorld().addObject(new Kolo(), getX(), getY());
            prebijeni = prebijeniMax;
        }
        else{
            if(prebijeni > -1) prebijeni--;
            prebijeni--;
            
        }
    }
}
