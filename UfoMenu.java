import greenfoot.*;

/**
 * Write a description of class UfoMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UfoMenu extends Actor
{
    int pohybX = 2, pohybY = 2;
    public void act()
    {
        if(getX() >= 580) pohybX *= -1;
        if(getY() >= 680) pohybY *= -1;
        if(getX() <= 20) pohybX *= -1;
        if(getY() <= 20) pohybY *= -1;
        this.setLocation(getX()+pohybX, getY()+pohybY);
    }
}
