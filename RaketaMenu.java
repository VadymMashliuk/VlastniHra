import greenfoot.*;

/**
 * Write a description of class RaketaMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaketaMenu extends Actor
{
    int pohybX = 2;
    public void act()
    {
        if(getX() >= 580) pohybX *= -1;
        if(getX() <= 20) pohybX *= -1;
        move(pohybX);
        strelba();
    }
    
    int nabojePlusOdpocetMax = 20;
    int nabojePlusOdpocet = 0;
    void strelba(){
        if(nabojePlusOdpocet == 0){
            nabojePlusOdpocet = nabojePlusOdpocetMax;
            getWorld().addObject(new KoloNepritel(), getX(), getY());
        }else{
            nabojePlusOdpocet--;
        }
    }
}
