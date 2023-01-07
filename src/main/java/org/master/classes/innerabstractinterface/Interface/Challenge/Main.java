package org.master.classes.innerabstractinterface.Interface.Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Players m = new Players("Must", 123, 32);
        System.out.println(m.toString());
        saveObject(m);

        m.setHitPoints(4);
        System.out.println(m);
        m.setWeapon("aaaaaa");
        saveObject(m);
        //loadObject(m);


        //monster class
        ISaveable wereWolf = new Monster("Wolf", 123, 1);
        System.out.println(wereWolf);

        //casting interface to class
        System.out.println("Strength of monster (cast) : "+((Monster) wereWolf).getStrength());

        saveObject(wereWolf);
        loadObject(wereWolf);

    }

    public static  ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("select an option:\n"+
                "1 enter string\n"+
                "0 quit");

        while(!quit){
            System.out.println("select option");
            int selection = scanner.nextInt();

            switch (selection){
                case 0:
                    System.out.println("quiting");
                    quit = true;
                    break;
                case 1:
                    System.out.println("enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }

        }

        return values;
    }


    public static void saveObject(ISaveable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving "+ objectToSave.write().get(i) + " to storage");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);

    }

}
