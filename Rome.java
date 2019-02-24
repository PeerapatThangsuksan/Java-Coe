import java.io.*;
import java.util.*;
public class Rome{
    
    
 public static void main(String args[])
    {
        Knight knight = new Knight();
        Novice novice = new Novice();
        Player player = new Player();
        Sniper sniper = new Sniper();
        Bag bag = new Bag();
        String[] item = new String[5];
        item [0]="Potion";
        item [1]="Trash";
        System.out.println("Your is Novice");
        System.out.print("Your HP: "+ novice.gethp());
        System.out.println("/100");
        System.out.print("Your EXP: "+ novice.getexp());
        System.out.println("/100");
        System.out.println("Your LV: "+ novice.getlevel());
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------");
        while(novice.gethp() != 0){

            int bottom = scanner.nextInt();
            
            if(novice.getlevel() < 3 ){
                 System.out.println("Choose 1 for ATK(Drop Potion )/ Choose 2 Heal from Potion / Choose 3 for look Your items");
System.out.println("Choose : ");
            if(bottom == 1) {
                
                novice.attack();

                int n = (int)Math.random()*5+0;
                    bag.getnewitem(item[n]);
                    System.out.println("Your choose attack your get dmg from monster -10 hp and +12 exp"); 
                    System.out.println("------------");
                   
                    System.out.println("New Item Add in Your bag");
                            }
            else if(bottom == 2) {
                novice.heal();
                System.out.println("Your choose heal +10 hp "); 
                System.out.println("------------");
                bag.itemout();

            }
            else if(bottom == 3){
                System.out.print("Your Items are : ");
                bag.showitem();
                scanner.next();
            }
            System.out.println("------------");
            System.out.println("Your is Novice(You can up class to Knight at level 3)");
            System.out.print("Your HP: "+ novice.gethp());
            System.out.println("/100");
            System.out.print("Your EXP: "+ novice.getexp());
            System.out.println("/100");
            System.out.println("Your LV: "+ novice.getlevel());
            System.out.println("------------");
        }
     
            else if (novice.getlevel() >= 3 ){
                System.out.println("============================ ");

                System.out.println("Choose 1 for ATK(Drop Potion )/ Choose 2 Heal from Potion / Choose 3 for look Your items / Choose 4 for UseSkill Bash for 5 monster ");
System.out.println("Choose : ");
                if(bottom == 1) {
                    player.attack();
                   
                    int n = (int)Math.random()*5+0;
                        bag.getnewitem(item[n]); 
                        System.out.println("Your choose attack your get dmg from monster -10 hp and + 12 exp ");
                        System.out.println("------------");
                        System.out.println("New Item Add in Your bag");
                                }
                else if(bottom == 2) {
                    player.heal();
                    System.out.println("Your choose heal +10 hp ");
                    System.out.println("------------");
                    bag.itemout();
    
                }
                else if(bottom == 3){
                    System.out.print("Your Items are : ");
                    bag.showitem();
                    scanner.next();
                }
                
                else if(bottom == 4) {
                    System.out.println("=======================");

                    player.Skill();
                  
                    System.out.println("------------");
                    int n = (int)Math.random()*5+0;
                        bag.getnewitem(item[n]);  
                         System.out.println("Your choose BASH"); 
                        System.out.println("------------");
                        System.out.println("New Item Add in Your bag");
                            
                  
                }
                
                System.out.println("------------");
                System.out.println("Your is Knight");
                System.out.print("Your HP: "+ player.gethp());
                System.out.println("/200");
                System.out.print("Your EXP: "+ player.getexp());
                System.out.println("/100");
                System.out.println("Your LV: "+ player.getlevel());
                System.out.println("------------");
                }
               
                
        }
          System.out.println("Your die");
    }
      
    }
