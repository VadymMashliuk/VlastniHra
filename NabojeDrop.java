import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NabojeDrop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NabojeDrop extends Actor
{
    /**
     * Act - do whatever the NabojeDrop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public NabojeDrop()
    {
        GreenfootImage img = new GreenfootImage(getImage());
        img.scale(117/9, 512/9);
        setImage(img);
    }
    
    public void act(){
        if(!dotknutiOkraje) pohyb();
    }
    
    
    boolean dotknutiOkraje = false;
    int pohybX = 1, pohybY = 2;
    void pohyb(){
        if(!dotknutiOkraje){
            turn(1);
            if(getX() >= 590) pohybX *= -1;
            if(getY() >= 680){
                dotknutiOkraje = true;
                getWorld().removeObject(this);
                return;
            }
            if(getX() <= 10) pohybX *= -1;
            this.setLocation(getX()+pohybX, getY()+pohybY);
        }
    }
}
