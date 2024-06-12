import greenfoot.*;
import greenfoot.GreenfootImage;

/**
 * Write a description of class Tlacitko here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tlacitko extends Actor
{
     private GreenfootImage menu_button_1 = new GreenfootImage("tlacitko.png");
    private GreenfootImage menu_button_2 = new GreenfootImage("tlacitkoStisk.png");
    
    private GreenfootImage menu_button_1 = new GreenfootImage("tlacitko.png");
    private GreenfootImage menu_button_2 = new GreenfootImage("tlacitkoStisk.png")
 
    private boolean mouseDown;
    private boolean obrazekNastaven = false;
    MyWorld w = new MyWorld();
     
    public Tlacitko() {
        mouseDown = false;
    }
 
    public void act() {
        if(this.getWorld().getClass() == Menu.class) tlacitkoSpustitHru();
        if(this.getWorld().getClass() == Prohra.class) tlacitkoRestartovatHru();
    }
    
    void tlacitkoSpustitHru(){
        if(!obrazekNastaven){
            setImage(menu_button_1);
            obrazekNastaven = true;
        }
        if(Greenfoot.mousePressed(this)) mouseDown = true;
        else if(!Greenfoot.mousePressed(this)) mouseDown = false;
        
        if (mouseDown) {  
            setImage(menu_button_2);
        }  
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(w);
        }  
    }
    
    void tlacitkoRestartovatHru(){
        if(!obrazekNastaven){
            setImage(menu_button_1);
            obrazekNastaven = true;
        }
        if(Greenfoot.mousePressed(this)) mouseDown = true;
        else if(!Greenfoot.mousePressed(this)) mouseDown = false;
        
        if (mouseDown) {  
            setImage(menu_button_2);
        }  
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(w);
        } 
    }
}
