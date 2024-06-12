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
    public int skore = 0;
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
        obtiznost();
        upgradeSpawn();
        lekarnickaSpawn();
        nabojeDropSpawn();
    }
    
    //obtížnost se bude zvyšovat podle skóre a čím vyšší obtíznost 
    //tím víc uf se bude spawnovat
    
    int obtiznostValue = 1;
    void obtiznost(){
        if(skore == 8){
            obtiznostValue = 2;
            maxPocetUfNaObrazovce = 8;
        }
        if(skore == 11){
            obtiznostValue = 3;
            ufoPocitadloMax = 140;
        }
        if(skore == 15){
            obtiznostValue = 4;
            maxPocetUfNaObrazovce = 10;
        }
        if(skore == 22){
            obtiznostValue = 5;
            ufoPocitadloMax = 80;
        }
        if(skore >= 100) Greenfoot.setWorld(new Vyhra());
        //Bude potřeba ještě správně nastavit obtížnost, 5 7 10 15
        //aby to nebylo moc těžké ani moc lehké
        //a ještě kromě lékarniček by to chtělo udělat náboje
    }
    
    private void prepare()
    {
        Naboje naboje = new Naboje();
        addObject(naboje,523,660);
        Srdce Srdce = new Srdce();
        addObject(Srdce,40,660);
        Skore skore = new Skore();
        addObject(skore, 80, 40);
        Obtiznost obtiznost = new Obtiznost();
        addObject(obtiznost, 500, 40);
    }
    
    int ufoPocitadlo = 0;
    int ufoPocitadloMax = 180;
    public int pocetUfNaObrazovce = 0;
    int maxPocetUfNaObrazovce = 6;
    
     void ufoSpawn(){
        
        if(pocetUfNaObrazovce <= maxPocetUfNaObrazovce){
            if (ufoPocitadlo == 0)
            {
                addObject(new Ufo(), Greenfoot.getRandomNumber(554) + 25, Greenfoot.getRandomNumber(220)+25);
                ufoPocitadlo = ufoPocitadloMax;
                pocetUfNaObrazovce++;
            }else{
                ufoPocitadlo--;
            }

        }
    }
    
    int upgradePocitadlo = 0;
    int upgradePocitadloMax = 700;
    int poziceUpgradeY;
    public void upgradeSpawn()
    {
        upgradePocitadlo++;
        if (upgradePocitadlo == upgradePocitadloMax)
        {
            poziceUpgradeY = Greenfoot.getRandomNumber(150) + 50;
            upgradePocitadlo = 0;
            Upgrade upgrade = new Upgrade();
            addObject(upgrade, 300, poziceUpgradeY);
        }
    }
    
    int lekarnickaPocitadlo = 0;
    int lekarnickaPocitadloMax = 1000;
    int poziceLekarnickyY;
    public void lekarnickaSpawn()
    {
        lekarnickaPocitadlo++;
        if (lekarnickaPocitadlo == lekarnickaPocitadloMax)
        {
            poziceLekarnickyY = Greenfoot.getRandomNumber(150) + 50;
            lekarnickaPocitadlo = 0;
            addObject(new Lekarnicka(), 300, poziceLekarnickyY);
            //Lékárnička vždy posunuje dolů
            //a objevuje se na náhodném místě
        }
    }
    
    int nabojeDropPocitadlo = 0;
    int nabojeDropPocitadloMax = 400;
    //  int pozicY;
    public void nabojeDropSpawn()
    {
        nabojeDropPocitadlo++;
        if (nabojeDropPocitadlo == nabojeDropPocitadloMax)
        {
            nabojeDropPocitadlo = 0;
            addObject(new NabojeDrop(), Greenfoot.getRandomNumber(544)+25, Greenfoot.getRandomNumber(200));
        }
    }
}
