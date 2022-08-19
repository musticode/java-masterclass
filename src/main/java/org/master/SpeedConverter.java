package org.master;

import java.sql.SQLOutput;

public class SpeedConverter {
    public static double toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }else{
            long rounded;
            return  rounded = Math.round(kilometersPerHour);
        }
    }


    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 8 && hourOfDay > 22){
            return true;
        }else if(hourOfDay < 0 && hourOfDay > 23){
            return false;
        }

        return barking;
    }

    public static double area(double radius){
        double area;
        if(radius < 0 ){
            System.out.println("Invalid");
            return -1;
        }
        area = radius*radius* Math.PI;
        return area;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0 ) {
            System.out.println("Invalid");
            return -1;
        }
        return x*y;
    }




}
