import java.io.*;
import java.util.*;
public class Novice
{
    private int hp;
    private int exp;
    private int level;
    private int item ;
    ArrayList<String> skillList;
    public int dmg;
    public int dmg2;
    public Novice()
    {
        level = 1;
        hp = 100;
        exp = 0;
      
    }
    public int Skill(){
        dmg = 20 ;
        exp = exp + 45;
        hp = hp - 20;
        if (exp >= 100)
        {   
            level = level+1;
            hp = 100;
            
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
            hp = 100;
            
            exp = 0;
        }
    }
   
   


    public void heal()
    { 
         hp = hp + 10;

        if(hp > 100){
                hp = 100;}
        
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

  
    public static void main(String args[])
    {
        Novice novice = new Novice();
        
        System.out.println("Your HP: "+ novice.gethp());
        System.out.println("Your EXP: "+ novice.getexp());
        System.out.println("Your LV: "+ novice.getlevel());
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------");
        while(novice.gethp() != 0){
System.out.println("Choose 1 for ATK / Choose 2 Heal from Potion ");
            int bottom = scanner.nextInt();
            if(bottom == 1) novice.attack();
            else if(bottom == 2) novice.heal();
            System.out.println("Your HP: "+ novice.gethp());
            System.out.println("Your EXP: "+ novice.getexp());
            System.out.println("Your LV: "+ novice.getlevel());
            System.out.println("------------");
        }
        System.out.println("Your die");
    }
}