

import java.io.*;
import java.util.*;




public class Mains {
  
    public static void main(String[] args) {
        Novice novice = new Novice();
        Scanner scanner = new Scanner(System.in);
        Monster mons = new Monster();
        Career career= new Career();
        Item item = new Item();
        int x=100;
        int heal=0;
        int Vanish=0;
        int Powerup=0;
        novice.ShowStatus();
        
        
        
        while(novice.gethp() != 0){
            System.out.println("------Menu Play-------");
            System.out.println("Choose 1 for ATK / Choose 2 Open Bag / Choose 3 ShowStatus");
            System.out.print("Choose :");
            int bottom = scanner.nextInt();
          if(bottom!=0){
              if(bottom==3){
             System.out.println("-----Player Status-----");     
             System.out.println("Your HP: "+ novice.gethp());
             System.out.println("Your EXP: "+ novice.getexp()+"/"+x*novice.getlevel());
             System.out.println("Your LV: "+ novice.getlevel());
             System.out.println("You Damage: "+novice.Dmg());
             if(novice.getlevel()==5){
                  novice.giveLv();
                  career.GetCareer();
                  
              }
             System.out.println("---Career---");
             career.Select();
             System.out.println("---Item Inbag---");     
             System.out.println("1.Healing :"+heal+"\n2.Powerup :"+Powerup+"\n3.Vanish :"+Vanish);  
              }
              else if(bottom==1){
          System.out.println("1.CatDevil\n2.TreeheadDog\n3.Dragon");  
          System.out.print("Choose :");
          int select = scanner.nextInt();
            if (select==1){
                System.out.print("Choose Attack :");
                int attack  = scanner.nextInt();
             if(attack == 1)novice.attackCat();
             
             System.out.println("Succeed");
             System.out.println("Cat Devil Dead");
             System.out.println("Monster HP: "+ novice.attackCat());
             System.out.println("Monster LV: "+ novice.getlevel());
             System.out.println("Status ");
             if(novice.gethp()<=0){
                 System.out.println("Your die");
                 System.exit(0);
             }else{
             System.out.println("-------------");
             System.out.println("Drop Item ");
             heal += item.DropiHealing();
             Vanish +=item.DropiVanish();
             Powerup +=item.DropiPowerup();
             item.setVanish(Vanish);
             item.setHeal(heal);
             item.setPower(Powerup);
             
             System.out.println("Your HP: "+ novice.gethp());
             System.out.println("Your EXP: "+ novice.getexp()+"/"+x*novice.getlevel());
             System.out.println("Your LV: "+ novice.getlevel());
              if(novice.getlevel()==5){
                   novice.giveLv();
                   career.GetCareer();
                 
              } 
             }
            
            }else if(select==2){
                 System.out.print("Choose Attack:");
                int attack  = scanner.nextInt();
             if(attack == 1)novice.attackDog();
                System.out.println("Succeed");
             System.out.println("TreeHeadDog Dead");
             System.out.println("Monset HP: "+ novice.attackDog());
             System.out.println("Monset LV: "+ novice.getlevel());
             System.out.println("Status ");
             if(novice.gethp()<=0){
                 System.out.println("Your die");
                 System.exit(0);
             }else{
             System.out.println("-------------");
             System.out.println("Drop Item ");
             heal += item.DropiHealing();
             Vanish +=item.DropiVanish();
             Powerup +=item.DropiPowerup();
             item.setVanish(Vanish);
             item.setHeal(heal);
             item.setPower(Powerup);
             System.out.println("Your HP: "+ novice.gethp());
             System.out.println("Your EXP: "+ novice.getexp()+"/"+x*novice.getlevel());
             System.out.println("Your LV: "+ novice.getlevel());
             if(novice.getlevel()==5){
                novice.giveLv();
                career.GetCareer();
                  
              } 
             }
            }else if(select==3){
                 System.out.print("Choose Attack:");
                int attack  = scanner.nextInt();
             if(attack == 1)novice.attackDragon();
                System.out.println("Succeed");
             System.out.println("Dragon Dead");
             System.out.println("Monset HP: "+ novice.attackDragon());
             System.out.println("Monset LV: "+ novice.getlevel());
             System.out.println("Status ");
             if(novice.gethp()<=0){
                 System.out.println("Your die");
                 System.exit(0);
             }else{
             System.out.println("-------------");
             System.out.println("Drop Item ");
             heal += item.DropiHealing();
             Vanish +=item.DropiVanish();
             Powerup +=item.DropiPowerup();
             item.setVanish(Vanish);
             item.setHeal(heal);
             item.setPower(Powerup);
             System.out.println("Your HP: "+ novice.gethp());
             System.out.println("Your EXP: "+ novice.getexp()+"/"+x*novice.getlevel());
             System.out.println("Your LV: "+ novice.getlevel());
             if(novice.getlevel()==5){
                  novice.giveLv();
                  career.GetCareer();
                  
              } 
             }
            }else{
                System.out.println("Agin");
            }  
          
          
          
          
          }else if(bottom==2){
          System.out.println("---Item Inbag---");     
          System.out.println("1.Healing :"+heal+"\n2.Powerup :"+Powerup+"\n3.Vanish :"+Vanish);  
          int select = scanner.nextInt();
           
          if(select == 1){
              item = new Item();
              
              System.out.println("Your Have Healing :"+(heal));
             
              if(heal>0){
            novice.heal();
            System.out.println("Your HP: "+ novice.gethp());
            System.out.println("Your EXP: "+ novice.getexp()+"/"+x*novice.getlevel());
            System.out.println("Your LV: "+ novice.getlevel());
            System.out.println("------------");
             if(novice.getlevel()==5){
                  novice.giveLv();
                  career.GetCareer();
                  
              } 
              heal--;
              }
              else{
                  System.out.println("Not Have Item");
              }
          }else if (select == 2) {
              item = new Item();
              
              System.out.println("Your Have Powerup :"+(Powerup));
             
              if(Powerup>0){
              novice.vinish();
            System.out.println("Your HP: "+ novice.gethp());
            System.out.println("Your EXP: "+ novice.getexp()+"/"+x*novice.getlevel());
            System.out.println("Your LV: "+ novice.getlevel());
            System.out.println("------------");
            if(novice.getlevel()==5){
                  novice.giveLv();
                  career.GetCareer();
                  
              } 
              Powerup--;
              }
              else{
                  System.out.println("Not Have Item");
              }
          
          }else if(select == 3){
              item = new Item();
              
              System.out.println("Your Have Vanish :"+(Vanish));
             
              if(Vanish>0){
              novice.vinish();
            System.out.println("Your HP: "+ novice.gethp());
            System.out.println("Your EXP: "+ novice.getexp()+"/"+x*novice.getlevel());
            System.out.println("Your LV: "+ novice.getlevel());
            System.out.println("------------");
            if(novice.getlevel()==5){
                  novice.giveLv();
                  career.GetCareer();
                  
              } 
              Vanish--;
              }
              else{
                  System.out.println("Not Have Item");
              }
          }
          }
          }else{
          } 
        }
        
    }

   

}

