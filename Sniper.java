import java.io.*;
import java.util.*;

public class Sniper extends Player{
   
    public int dmg;
    private int hp;
    private int exp;
    private int level;
    private int item ;
    
    public int Skill(){
        dmg = 20 ;
        exp = exp + 40;
        hp = hp - 20;
        if (exp >= 100)
        {   
            level = level+1;
            hp = 100;
            
            exp = 0;
        }
        System.out.println("Arrow shower ATTACK DMG = 20 TO Five MONSTER AND get damage 20 from monster");
        return dmg;
    }
}