import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KoloNepritel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KoloNepritel extends Actor
{
    int pohybY = -4;
    boolean otoceny = false;
    public KoloNepritel(){
        GreenfootImage img = new GreenfootImage(getImage());
        img.scale(3000/70, 1835/70);
        setImage(img);
        //if (this.getWorld().getClass() == Menu.class) turn(-90);
        
    }
    public void act()
    {
        if (this.getWorld().getClass() == MyWorld.class) move(5);
        else if (this.getWorld().getClass() == Menu.class){ 
            if(!otoceny){
                otoceny = true;
                turn(-90);
            }
            this.setLocation(getX(), getY()+pohybY);
        }
        //this.setLocation(getX(), getY()+pohybY);
        if(isAtEdge()) getWorld().removeObject(this);
    }
    
    
}
