

import java.io.*;
import java.util.*;

public class Monster {
    private int CatDevil ;
    private int TreeHeadDog ;
    private int Dragon ;
    private ArrayList<Monster> Monsters;

    public Monster(){
        Monsters= new ArrayList< Monster >();
    }

    public void add(Monster m){
      Monsters.add(m);
  }

    
    public void setCatDevil(int CatDevil){
      this.CatDevil=CatDevil;
          }
    public void setTreeHeadDog(int TreeHeadDog){
      this.TreeHeadDog=TreeHeadDog;
          }
    public void setDragon(int Dragon){
      this.Dragon=Dragon;
          }
    public int getCatDevil(){
    CatDevil = 100;
    return CatDevil;
          }
    public int getTreeHeadDog(){
    TreeHeadDog = 300;
    return TreeHeadDog;
          }
    public int getDragon(){
    Dragon = 500;
    return Dragon;
          }
}
