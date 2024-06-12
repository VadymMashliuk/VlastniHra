import greenfoot.*;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    public GameOver()
    {
        super(600, 700, 1); 
        
        GreenfootImage bg = getBackground();
        GreenfootImage background = new GreenfootImage("bg.png");
        bg.drawImage(background, 0, -700);
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Tlacitko tlacitkoRestart = new Tlacitko();
        addObject(tlacitkoRestart,300,500);
        tlacitkoRestart.jsemRestartovatHru = true;

        Tlacitko tlacitkoKonec = new Tlacitko();
        addObject(tlacitkoKonec,300,620);
        tlacitkoKonec.jsemUkoncitHru = true;
        
        
        ProhraNapis prohraNapis = new ProhraNapis();
        addObject(prohraNapis,300,150);
    }
}
