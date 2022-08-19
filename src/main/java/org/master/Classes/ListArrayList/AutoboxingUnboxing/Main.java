package org.master.Classes.ListArrayList.AutoboxingUnboxing;

import java.util.ArrayList;

class IntClass{
    private int value;
    public IntClass(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

}


public class Main {
    public static void main(String[] args) {
        ArrayList<IntClass> intClasses = new ArrayList<IntClass>();
        intClasses.add(new IntClass(3));
        
    }
}
