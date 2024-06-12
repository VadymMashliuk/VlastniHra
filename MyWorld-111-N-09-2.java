import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    GreenfootImage background;
    int currentX, currentY;
int pocitadlo = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        addObject(new Raketa(), 300, 300);
        background = new GreenfootImage("spaceFull.png");
        getBackground().drawImage(background, 0, -100);
        
    }
    
    public void drawBackground(){
        getBackground().drawImage(background, -currentX, -currentY);
    }
    
    public void changeCurrentXY(int changeX, int changeY){
        currentX += changeX;
        currentY -= changeY;
    }
    
    public void act(){
        drawBackground();
        changeCurrentXY(1, -100);
        pocitadlo++;
        
    }
 
}
