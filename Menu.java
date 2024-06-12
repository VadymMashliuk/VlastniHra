import greenfoot.*;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    public Menu()
    {    
        super(600, 700, 1); 
        setPaintOrder(Nazev.class, Tlacitko.class, UfoMenu.class,RaketaMenu.class, KoloNepritel.class);

        GreenfootImage bg = getBackground();
        GreenfootImage background = new GreenfootImage("bg.png");
        bg.drawImage(background, 0, -700);
        prepare();
    }
    
    private void prepare()
    {
        Tlacitko tlacitkoMenu = new Tlacitko();
        addObject(tlacitkoMenu,300,400);
        tlacitkoMenu.jsemSpustitHru = true;
        
        Tlacitko tlacitkoAbout = new Tlacitko();
        addObject(tlacitkoAbout,300,530);
        tlacitkoAbout.jsemAbout = true;

        Nazev nazev = new Nazev();
        addObject(nazev,300,150);

        UfoMenu ufoMenu = new UfoMenu();
        addObject(ufoMenu,514,354);
        RaketaMenu raketaMenu = new RaketaMenu();
        addObject(raketaMenu,108,649);
    }
}
