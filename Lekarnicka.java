import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lekarnicka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lekarnicka extends Actor
{
    int smer;
    int pohyb = 1;
    boolean dotknutiOkraje = false;
    public Lekarnicka()
    {
        smer = Greenfoot.getRandomNumber(2);
    }
    public void act()
    {
        if (smer == 0) smer -= pohyb;
        if (!dotknutiOkraje)
        {
            setLocation(getX() + smer, getY() + 2);
            turn(1);
            if(isAtEdge())
            {
                dotknutiOkraje = true;
                getWorld().removeObject(this);
            }
        }
    }
}
