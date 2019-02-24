import java.io.*;
import java.util.*;
public class Player
{
    private int hp;
    private int exp;
    private int level;
    
    ArrayList<String> skillList;
    public int dmg;
    public int dmg2;
    public Player()
    {
        level = 3;
        hp = 200;
        exp = 0;
      
    }
    public int Skill(){
        dmg = 20 ;
        exp = exp + 45;
        hp = hp - 20;
        if (exp >= 100)
        {   
            level = level+1;
            hp = 200;
            
            exp = 0;
        }
        System.out.println("BASH ATTACK DMG = 20 TO 5 MONSTER AND get damage 20 from monster get 5 exp per 1 one monster");
        return dmg;
    }
    public void attack() //Attack and recieve exp and damagetome from monster
    {   
    
        exp = exp + 12;
        hp = hp - 10;
        if (exp >= 100)
        {   
            level = level+1;
            hp = 200;
            
            exp = 0;
        }
    }
   
   


    public void heal()
    { 
         hp = hp + 10;

        if(hp > 200){
                hp = 200;}
        
    }
    

    public int gethp()
    {
        return hp;
    }
    public int getexp()
    {
        return exp;
    }
    public int getlevel()
    {
        return level;
    }
 
    public int useSkill(int select){
        dmg = 20 ;
        dmg2= 30 ;
        if(select==1){
                System.out.println("Fire Ball Active");
                return dmg;
        }
        if(select==2){
                System.out.println("Meteo Strom Active");
                return dmg2;
        }
        return 0;
    }
}
  
  