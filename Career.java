

import java.io.*;
import java.util.*;
public class Career {
    Novice novice = new Novice();
         private  int career;
         int choose=0;
         
         public void setCareer(int career){
         this.career=career;
         }
         public  int getCareer(){
        
             return career;
         }

         
  public void getSword(){
    novice = new Novice();
    novice.CareerDmgS();
}
public void getMelee(){
     novice = new Novice();
    novice.CareerDmgM();
}  
    
  public void GetCareer(){
Novice novice =new Novice();
Career career = new Career();
Scanner scanner = new Scanner(System.in);

        System.out.println("-------Register Carneer-----");
        System.out.println("1.Sword  2.Melee");
        System.out.print("Choose :");
        choose += scanner.nextInt();
        career.setCareer(choose);
        System.out.println("------------");
        System.out.println("Registed Succeed");
        System.out.println("System Give +1 LV");
        
       
       
}
  public int Select(){
      
    Career career= new Career();
    int x=0; 
    if(choose==1){
             career.SelectCareerS();
             x++;
             System.out.println(x);
             }else if(choose==2){
             career.SelectCareerM();
             x+=2;
             }else{
             
             }
        return x;
 }

 public void SelectCareerS(){
     Career career= new Career();
     novice = new Novice();
     System.out.println("You Career: Sword");
     career.getSword();
     int sum = 0;
     int dmg = novice.Dmg();
     int dmgSelect = novice.CareerDmgS();
     sum = dmg+dmgSelect;
     System.out.println("You Damage+CareerItem: "+sum);
 }
 public void SelectCareerM(){
     Career career= new Career();
     novice = new Novice();
    System.out.println("You Career: Melee");
    career.getMelee();
    int sum = 0;
     int dmg = novice.Dmg();
     int dmgSelect = novice.CareerDmgM();
     sum = dmg+dmgSelect;
     System.out.println("You Damage+CareerItem: "+sum);
 }

   
}
