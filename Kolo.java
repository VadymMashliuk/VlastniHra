import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kolo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kolo extends Actor
{
    MyWorld svet = (MyWorld) getWorld();
    public Kolo()
    {
        GreenfootImage img = new GreenfootImage(getImage());
        img.scale(1835/70, 3000/70);
        setImage(img);
        turn(-180);
        //svet = (MyWorld) getWorld();
    }
    
    boolean dotknutiUfa = false;
    //MyWorld svet;
    
    public void act()
    {
        if(!dotknutiUfa) setLocation(getX(), getY() - 4);
        if (!dotknutiUfa)
        {
            if (isAtEdge()){
                dotknutiUfa = true;
                getWorld().removeObject(this);
            }
        }        
        if (!dotknutiUfa) sestreleniUfa();
        
        if (ufoUmira) explozeUfa();
    }
    
    private boolean ufoUmira = false;
    void sestreleniUfa()
    {
        if(!dotknutiUfa){
            if (this.getWorld().getClass() == MyWorld.class) {
                if(this.isTouching(Ufo.class)){
                    if(this.getWorld().getClass() == MyWorld.class){
                        MyWorld svet = (MyWorld) getWorld();
                        svet.skore++;
                    }
                    dotknutiUfa = true;
                    ufoUmira = true;
                    removeTouching(Ufo.class);
                    ((MyWorld) getWorld()).pocetUfNaObrazovce--;
                }else{
            
                }
            }
        }
    }
    
    int pocitadloObrazkuSmrti = 0;
    void explozeUfa(){
          if(ufoUmira)
          {
            pocitadloObrazkuSmrti++;
            if(1 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_09_delay-0.01s.png");
            else if(2 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_09_delay-0.01s.png");
            else if(3 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_11_delay-0.01s.png");
            else if(4 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_11_delay-0.01s.png");
            else if(5 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_13_delay-0.01s.png");
            else if(6 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_13_delay-0.01s.png");
            else if(7 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_15_delay-0.01s.png");
            else if(8 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_15_delay-0.01s.png");
            else if(9 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_16_delay-0.01s.png");
            else if(10 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_16_delay-0.01s.png");
            else if(11 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_00_delay-0.01s.png");
            else if(12 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_00_delay-0.01s.png");
            else if(13 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_01_delay-0.01s.png");
            else if(14 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_01_delay-0.01s.png");
            else if(15 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_02_delay-0.01s.png");
            else if(16 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_02_delay-0.01s.png");
            else if(17 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_03_delay-0.01s.png");
            else if(18 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_03_delay-0.01s.png");
            else if(19 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_05_delay-0.01s.png");
            else if(20 == pocitadloObrazkuSmrti)
              setImage("exploze/frame_05_delay-0.01s.png");
            else
              getWorld().removeObject(this);
 
        return;
        }
    }
}
