import greenfoot.*;

/**
 * Write a description of class Vyhra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vyhra extends World
{
    public Vyhra()
    {
        super(600, 700, 1); 
        
        GreenfootImage bg = getBackground();
        GreenfootImage background = new GreenfootImage("bg.png");
        bg.drawImage(background, 0, -700);
        
        prepare();
    }
    
    private void prepare()
    {
        Tlacitko tlacitkoRestart = new Tlacitko();
        addObject(tlacitkoRestart,300,500);
        tlacitkoRestart.jsemRestartovatHru = true;

        Tlacitko tlacitkoKonec = new Tlacitko();
        addObject(tlacitkoKonec,300,620);
        tlacitkoKonec.jsemUkoncitHru = true;
        
        
        VyhraNapis vyhraNapis = new VyhraNapis();
        addObject(vyhraNapis,300,170);
    }
}
