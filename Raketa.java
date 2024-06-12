import greenfoot.*;

/**
 * Write a description of class Raketa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Raketa extends Actor
{
    int prebijeniMax = 15;
    int prebijeni = 0;
    int naboje = 10;
    public boolean dvojitaStrelba = false;
    public void act()
    {
        pohyb();
        strelba();
        pridavaniNaboju();
        zvyseniZivoty();
        klesajiciZivoty();
        nabojeDropZvyseniNaboju();
        dvojitaStrelbaCheck();
    }
    
    void pohyb(){
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 2);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 2);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 2, getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 2, getY());
        }
    }
    
    void strelba(){
        String klavesa = Greenfoot.getKey();
        getWorld().showText("" + naboje, 555, 660);
        if ("space".equals(klavesa) && prebijeni == 0)
        {
            if(naboje > 0){
                if(!dvojitaStrelba) getWorld().addObject(new Kolo(), getX(), getY());
                else if (dvojitaStrelba){
                    getWorld().addObject(new Kolo(), getX()+15, getY());
                    getWorld().addObject(new Kolo(), getX()-15, getY());
                }
                prebijeni += prebijeniMax;
                naboje--;
            }
        }
        else if(prebijeni != 0){
            prebijeni--;
        }
        
    }
    
    public void zvyseniZivoty()
    {
        if (isTouching(Lekarnicka.class))
        {
            hp++;
            removeTouching(Lekarnicka.class);
        }
        if (hp == 6) hp--;
    }
    
    public void nabojeDropZvyseniNaboju()
    {
        if (isTouching(NabojeDrop.class))
        {
            naboje += Greenfoot.getRandomNumber(3)+1;
            removeTouching(NabojeDrop.class);
        }
    }
    
    int hp = 5;
    MyWorld svet;
    void klesajiciZivoty(){
        svet = (MyWorld) getWorld();
        if(this.isTouching(KoloNepritel.class)){
            removeTouching(KoloNepritel.class);
            hp--;
            dvojitaStrelba = false;
        }
        getWorld().showText(""+hp, 40, 660);
        if(hp <= 0){
            GameOver prohra = new GameOver();
            Greenfoot.setWorld(prohra);
        }else{

        }
        
    }
    
    int nabojePlusOdpocetMax = 180;
    int nabojePlusOdpocet = 180;
    void pridavaniNaboju(){
        if(nabojePlusOdpocet == 0){
            naboje++;
            nabojePlusOdpocet = nabojePlusOdpocetMax;
        }else{
            nabojePlusOdpocet--;
        }
    }
    
    void dvojitaStrelbaCheck(){
        if(this.isTouching(Upgrade.class) && !dvojitaStrelba){
            dvojitaStrelba = true;
            removeTouching(Upgrade.class);
        }
        
        if(dvojitaStrelba) getWorld().showText("Dvojtá střelba je aktivní.", 305, 660);
        if(!dvojitaStrelba) getWorld().showText("", 305, 660);
    }
    
}
