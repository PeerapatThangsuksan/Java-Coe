import java.io.*;
import java.util.*;
public class Novice
{
    private int hp;
    private int exp;
    private int level;
    private int item ;
    
    public Novice()
    {
        level = 1;
        hp = 100;
        exp = 0;
      
    }
    public void attack() //Attack and recieve exp and damagetome from monster
    {   
       
        exp = exp + 8;
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