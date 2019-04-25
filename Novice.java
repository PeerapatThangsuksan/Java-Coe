

import java.io.*;
import java.util.*;

public class Novice {
    Bag bag = new Bag();
    Monster mons =new Monster();
    private int hp;
    private int exp;
    private int level;
    private int item ;
    private int killed;
    public int dmg;
    public int Upgrade;
    public int gems;
    private String carreername;
    

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

    public int gem()
    {
        return gems;
    }
  
    public int getkill(){
        return killed;
    }

    public Novice()
    {   
        dmg = 30;
        level =5;
        hp = 100;
        exp = 0;
        gems=0;
    }
    public int Dmg(){
    return dmg;
    }
    public int CareerDmgS(){
       dmg = dmg+70;
        return dmg;
    }
    public int giveLv(){

    

    level = 6;
    
    return level;
    }
    public int CareerDmgM(){
       dmg = dmg+50;
        return dmg;
    }
    public  int attackDragon() //Attack and recieve exp and damagetome from monster
    {    int sum = 0; 
        
       while(sum>0){
       sum = mons.getDragon()-dmg;
       mons.setDragon(sum);
     
       }
       if (sum == 0){
          exp =exp+25;
          hp =hp-25;
          if(exp>=100*level){
            level = level+1;
            hp = 100;
            exp = 0;
                  }
       }
        return sum;
    }
public  int attackDog() //Attack and recieve exp and damagetome from monster
    {    int sum = 0; 
       while(sum>0){
       sum = mons.getTreeHeadDog()-dmg;
       mons.setTreeHeadDog(sum);
      
       }
       if (sum == 0){
          exp =exp+9*3;
          hp =hp-9*3;
          if(exp>=100*level){
            level = level+1;
            hp = 100;
            exp = 0;
                  }
       }
        return sum;
    }
    public  int attackCat() //Attack and recieve exp and damagetome from monster
    {    int sum = 0; 
         
       while(sum>0){
       sum = mons.getCatDevil()-dmg;
       mons.setCatDevil(sum);
       
       }
       if (sum == 0){
          exp =exp+7*2;
          hp =hp-7*2;
          if(exp>=100*level){
            level = level+1;
            hp = 100;
            exp = 0;
                  }
       }
        return sum;
    }
public void vinish(){
    
  exp = exp +bag.getVanish();
  if (exp >= 100*level)
        {   
            level = level+1;
            hp = 100;
            
            exp = 0;
        }
}
public void powerup(){
    
  dmg = dmg+100;
  hp = 100;
  if (exp >= 100*level)
        {   
            level = level+1;
            hp = 100;
            
            exp = 0;
        }
}
public void FullHeal(){
   hp=100;

}
public void heal()
    {  
         hp = hp + bag.getHealing();
         if(hp > 100){
                hp = 100;}
        
    } 

    
public void ShowStatus(){
    Novice novice = new Novice();
   
    Item item = new Item();
    int x=100;
    System.out.println("-----Novice Data-----");
    System.out.println("Your HP: "+ novice.gethp());
    System.out.println("Your EXP: "+ novice.getexp()+"/"+x*novice.getlevel());
    System.out.println("Your LV: "+ novice.getlevel());
    
    

}



}
    