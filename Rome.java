import java.io.*;
import java.util.*;
public class Rome{

 public static void main(String args[])
    {
        Novice novice = new Novice();
        Bag bag = new Bag();
        String[] item = new String[5];
        item [0]="Potion";
        item [1]="Trash";
        System.out.println("Your HP: "+ novice.gethp());
        System.out.println("Your EXP: "+ novice.getexp());
        System.out.println("Your LV: "+ novice.getlevel());
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------");
        while(novice.gethp() != 0){
System.out.println("Choose 1 for ATK(Drop Potion )/ Choose 2 Heal from Potion / Choose 3 for look Your items");
System.out.println("Choose : ");
            int bottom = scanner.nextInt();
            if(bottom == 1) {
                novice.attack();
                int n = (int)Math.random()*5+0;
                    bag.getnewitem(item[n]); 
                    System.out.println("------------");
                    System.out.println("New Item Add in Your bag");
                            }
            else if(bottom == 2) {
                novice.heal();
                System.out.println("------------");
                bag.itemout();

            }
            else if(bottom == 3){
                System.out.print("Your Items are : ");
                bag.showitem();
                scanner.next();
            }
            System.out.println("------------");
            System.out.println("Your HP: "+ novice.gethp());
            System.out.println("Your EXP: "+ novice.getexp());
            System.out.println("Your LV: "+ novice.getlevel());
            System.out.println("------------");
        }
        
        System.out.println("Your die");
    }
}