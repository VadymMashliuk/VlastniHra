import greenfoot.*;
import java.util.Objects;

/**
 * Write a description of class Ufo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ufo extends Actor
{
    public void act()
    {
        strelba();
        pohyb();
    }
    
    int nabojePlusOdpocetMax = 500;
    int nabojePlusOdpocet = 60;
    public void strelba(){
        if(nabojePlusOdpocet == 0){
            nabojePlusOdpocet = nabojePlusOdpocetMax;
            KoloNepritel koloNepritel = new KoloNepritel();
            getWorld().addObject(koloNepritel, getX(), getY());
            
                
            java.util.List raketa = getWorld().getObjects(Raketa.class);
            
            if (! raketa.isEmpty())
            {
                Actor actor = (Actor)raketa.get(0);
                koloNepritel.turnTowards(actor.getX(), actor.getY());
                // setRotation(0); // to maintain upright actor
            }
            
            
        }else{
            nabojePlusOdpocet--;
        }
    }
    
    int pohybX = 1, pohybY = 1;
    void pohyb(){
        if(getX() >= 590) {
            pohybX *= -1;
        }
        if(getY() >= 300) {
            pohybY *= -1;
        }   
        if(getX() <= 10){
            pohybX *= -1;
        }
        if(getY() <= 10){ 
            pohybY *= -1; 
        }
        this.setLocation(getX()+pohybX, getY()+pohybY);
    }
}
