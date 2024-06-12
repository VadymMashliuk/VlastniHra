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
    }
    
    int nabojePlusOdpocetMax = 120;
    int nabojePlusOdpocet = 60;
    
    void strelba(){
        if(nabojePlusOdpocet == 0){
            nabojePlusOdpocet = nabojePlusOdpocetMax;
            KoloNepritel KoloNepritel = new KoloNepritel();
            
            
            
        }else{
            nabojePlusOdpocet--;
        }
    }
}
