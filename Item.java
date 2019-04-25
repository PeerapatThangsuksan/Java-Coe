

import java.io.*;
import java.util.*;



public class Item{
   public int Healing;
    public int Powerup ;
    public int Vanish ;
    public void setHeal(int Healing){
    this.Healing=Healing;
    }
    public void setPower(int Powerup){
    this.Powerup=Powerup;
    }
    public void setVanish(int Vanish){
    this.Vanish=Vanish;
    }
    public int getCountHeal(){
    return Healing;
          }
    public int getCountVanish(){
    return Vanish;
          }
    public int getCountPower(){
    return Powerup;
          }
    public int DropiHealing(){
       int iHealing = 1+(int)(Math.random()*(5));
        return iHealing;
    }
     public int DropiVanish(){
       int iVanish =  1+(int)(Math.random()*(5));
        return iVanish;
    }
      public int DropiPowerup(){
       int iPowerup = 1+(int)(Math.random()*(5));     
        return iPowerup;
    }
    
    
}


