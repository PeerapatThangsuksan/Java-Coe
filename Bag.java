import java.io.*;
import java.util.*;
public class Bag{
    private ArrayList<Item> items;
    private int Max ;
    public Bag(){
        items = new ArrayList<Item>();
        items.add(new Item("Potion"));
       
        Max = 10;
    }

    public void getnewitem(String name){
        items.add(new Item(name));
    }
    public void showitem(){
        for (Item i  : items){
            System.out.print(i.getItem());
          System.out.print("///");
        }
        System.out.println("");
    } 
    public void itemout(){
   if(items.size()!=0)
        items.remove(0);
else {
    System.out.println("No items in your bag");
    }
}
}