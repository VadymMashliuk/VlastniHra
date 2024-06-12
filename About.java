import greenfoot.*;

/**
 * Write a description of class About here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class About extends World
{
    public About()
    {
        super(600, 700, 1);
        
        prepare();
    }
    
    void prepare(){
        Tlacitko tlacitkoKonec = new Tlacitko();

        addObject(tlacitkoKonec,300,620);
        tlacitkoKonec.jsemUkoncitHru = true;
        tlacitkoKonec.setLocation(100,665);
    }
}
