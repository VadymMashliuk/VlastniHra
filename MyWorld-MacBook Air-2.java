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
    public Raketa raketa = new Raketa();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 700, 1);
        addObject(raketa, 300, 600);
        background = new GreenfootImage("bg.png");
        getBackground().drawImage(background, 0, 700);
        prepare();
    }

    public void drawBackground(){
        getBackground().drawImage(background, -currentX, -currentY);
    }

    public void changeCurrentXY(int changeX, int changeY){
        currentX += changeX;
        currentY += changeY;
        if(currentY <= 0) currentY = 700;
    }

    public void act(){
        drawBackground();
        changeCurrentXY(0, -4);
        ufoSpawn();
        skore();
    }
    
    void skore(){
        getWorld().showText(""+hp, 40, 660);
    }
    
        void skore(){
        getWorld().showText(""+hp, 40, 660);
    }
    
    private void prepare()
    {
        Naboje naboje = new Naboje();
        addObject(naboje,522,224);
        naboje.setLocation(523,660);
        Srdce Srdce = new Srdce();
        addObject(Srdce,40,660);
    }
    
    int ufoPocitadlo = 0;
    int ufoPocitadloMax = 180;
    public int pocetUfNaObrazovce = 0;
    int maxPocetUfNaObrazovce = 6;
    
     void ufoSpawn(){
        
        if(pocetUfNaObrazovce <= maxPocetUfNaObrazovce){
            if (ufoPocitadlo == 0)
            {
                addObject(new Ufo(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(250));
                ufoPocitadlo = ufoPocitadloMax;
                pocetUfNaObrazovce++;
            }else{
                ufoPocitadlo--;
            }

        }
    }

}
