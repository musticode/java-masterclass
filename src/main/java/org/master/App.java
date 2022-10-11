package org.master;

import java.util.*;

public class App {
    public static void main(String[] args) {
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println(minInt + "\n" + maxInt);
        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("aaa");
        }


        String res = isAlien == true ? "isAlien: true" : "isAlien: false";
        System.out.println(res);

        System.out.println("-----------------Area converter----------------");
        double area = SpeedConverter.area(-5.0, 4.0);
        System.out.println(area);


        //iterating
        Map<Integer, String> newMapCountryCodes = new HashMap<>();
        newMapCountryCodes.put(1, "USA");
        newMapCountryCodes.put(2, "USA2");
        newMapCountryCodes.put(3, "USA3");
        newMapCountryCodes.put(4, "USA4");
        newMapCountryCodes.put(5, "USA5");

        Set<Integer> setCodes = newMapCountryCodes.keySet();
        Iterator<Integer> iterator = setCodes.iterator();

        while (iterator.hasNext()){
            int code = iterator.next();
            String country = newMapCountryCodes.get(code);
            System.out.println(code + " -> " + country);
        }

        System.out.println("------------------------");
        newMapCountryCodes.forEach(
                (code, country)->System.out.println(code + " - "+ country)
        );













    }
}


