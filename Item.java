import java.io.*;
import java.util.*;
public class Item{
   private String nameitem;
   private int heal ;
    public Item (String name){
    nameitem = name ;
    if(nameitem.equals("Potion"))
    {
       heal = 10 ;
    }
  
    }
    
    public String getItem(){
        return nameitem;
}
}

