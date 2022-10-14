package org.master.Classes.Collections.AdventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        locations.put(0, new Location(0, "You are sitting in front of com learning java0"));
//        locations.put(1, new Location(1, "You are sitting in front of com learning java1"));
//        locations.put(2, new Location(2, "You are sitting in front of com learning java2"));
//        locations.put(3, new Location(3, "You are sitting in front of com learning java3"));
//        locations.put(4, new Location(4, "You are sitting in front of com learning java4"));
//        locations.put(5, new Location(5, "You are sitting in front of com learning java5"));

        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("S", 3);
        tempExit.put("E", 4);
        tempExit.put("N", 5);
        tempExit.put("Q", 0);

        tempExit = new HashMap<>();
        locations.put(6, new Location(6,"ssss", tempExit));








//        locations.get(1).addExit("W", 2);
//        locations.get(1).addExit("S", 3);
//        locations.get(1).addExit("E", 4);
//        locations.get(1).addExit("N", 5);
//        locations.get(1).addExit("Q", 0);

//        locations.get(2).addExit("N", 5);
//        locations.get(2).addExit("Q", 0);
//
//        locations.get(3).addExit("W", 1);
//        locations.get(3).addExit("Q", 0);
//
//
//        locations.get(4).addExit("N", 1);
//        locations.get(4).addExit("W", 2);
//        locations.get(4).addExit("Q", 0);
//
//        locations.get(5).addExit("S", 1);
//        locations.get(5).addExit("W", 2);
//        locations.get(5).addExit("Q", 0);



        //
        String[] road = "You are standing at the end of a road before a small brick".split(" ");
        for (String i: road){
            System.out.println(i);
        }

        String [] building = "You are inside building, test".split(", ");
        for (String j: building){
            System.out.println(j);
        }






        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0){
                break;
            }


            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are");

            for (String exit: exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if (exits.containsKey(direction)){
                loc = exits.get(direction);
            }else{
                System.out.println("you cant go in that direction");
            }

        }


    }
}
