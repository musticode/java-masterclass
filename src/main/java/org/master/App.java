package org.master;

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

    }
}


