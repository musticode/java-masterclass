package org.master.classes.listarraylist;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList <String> groceryList = new ArrayList<String>();


    public void addGroceryList(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have" + groceryList.size());
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + " ." + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+ position +" has been modified.");
    }

    public void removeGroceryItem(int position){
        groceryList.remove(position);

    }

}
