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
    
    private GreenfootImage prohra_button_1 = new GreenfootImage("tlacitkoRestart.png");
    private GreenfootImage prohra_button_2 = new GreenfootImage("tlacitkoRestartStisk.png");
    
    private GreenfootImage konec_button_1 = new GreenfootImage("tlacitkoKonec.png");
    private GreenfootImage konec_button_2 = new GreenfootImage("tlacitkoKonecStisk.png");
    
    private GreenfootImage about_button_1 = new GreenfootImage("tlacitkoAbout.png");
    private GreenfootImage about_button_2 = new GreenfootImage("tlacitkoAboutStisk.png");
    
 
    private boolean mouseDown;
    private boolean obrazek = false;
    
    public boolean jsemSpustitHru = false;
    public boolean jsemRestartovatHru = false;
    public boolean jsemUkoncitHru = false;
    public boolean jsemAbout = false;
    
    
    public Tlacitko() {
        mouseDown = false;
    }
 
    public void act() {
         if(jsemSpustitHru) tlacitkoSpustitHru();
         if(jsemRestartovatHru) tlacitkoRestartovatHru();
         if(jsemUkoncitHru) tlacitkoUkoncitHru();
         if(jsemAbout) tlacitkoOHre();
    }
    
    void tlacitkoSpustitHru(){
        if(!obrazek){
            setImage(menu_button_1);
            obrazek = true;
        }
        if(Greenfoot.mousePressed(this)) mouseDown = true;
        else if(!Greenfoot.mousePressed(this)) mouseDown = false;
        
        if (mouseDown) {  
            setImage(menu_button_2);
        }  
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MyWorld());
        }  
    }
    
        void tlacitkoRestartovatHru(){
        if(!obrazek){
            setImage(prohra_button_1);
            obrazek = true;
        }
            
        if(Greenfoot.mousePressed(this)) mouseDown = true;
        else if(!Greenfoot.mousePressed(this)) mouseDown = false;
        
        if (mouseDown) {  
            setImage(prohra_button_2);
        }  
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MyWorld());
        }  
    }
    
    void tlacitkoUkoncitHru(){
        if (this.getWorld().getClass() == About.class){
            if(!obrazek){
                konec_button_1.scale(191, 60);
                setImage(konec_button_1);
                obrazek = true;
            }
            
            if(Greenfoot.mousePressed(this)) mouseDown = true;
            else if(!Greenfoot.mousePressed(this)) mouseDown = false;
        
            if (mouseDown) { 
                konec_button_2.scale(191, 60);
                setImage(konec_button_2);
            }  
            if (Greenfoot.mouseClicked(this)) {
                Greenfoot.setWorld(new Menu());
            }  
        }else{
            if(!obrazek){
                setImage(konec_button_1);
                obrazek = true;
            }
            
            if(Greenfoot.mousePressed(this)) mouseDown = true;
            else if(!Greenfoot.mousePressed(this)) mouseDown = false;
        
            if (mouseDown) {  
                setImage(konec_button_2);
            }  
            if (Greenfoot.mouseClicked(this)) {
                Greenfoot.setWorld(new Menu());
            }  
        }
        
    }
    
    void tlacitkoOHre(){
        if(!obrazek){
            setImage(about_button_1);
            obrazek = true;
        }
            
        if(Greenfoot.mousePressed(this)) mouseDown = true;
        else if(!Greenfoot.mousePressed(this)) mouseDown = false;
        
        if (mouseDown) {  
            setImage(about_button_2);
        }  
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new About());
        }  
    }

}
