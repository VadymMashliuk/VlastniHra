import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public ImgScroll scroller; // scroll controller
    private Jimmy jimmy; // main actor
    

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new Raketa(), 300, 300);
        
  
    }
    
    public void act(){
        scroll();
    }
    
    private void scroll(){
        scroller.scroll();
    }
}
