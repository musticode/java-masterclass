package org.master.Classes.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysReverse {
    public static void main(String[] args) {
        int [] array =  {1,2,3};
        reverse3(array);
        reverseSwap(array);

//        Collections.reverse(Arrays.asList(a));
//        System.out.println(Arrays.asList(a));

    }
    public static void reverseSwap(int [] array){
        int k;
        int t;
        for (int i = 0; i < array.length / 2 ; i++){
            t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }

        System.out.println(Arrays.toString(array));
    }


    public static void reverse3(int [] array){
        int [] reversed = new int[array.length];
        int j = array.length;
        for(int i = 0; i < array.length; i++){
            reversed[j-1] = array[i];
            j--;
        }

        for (int i = 0; i< reversed.length; i++){
            System.out.println(reversed[i]);
        }
    }







    public static void reverse2(int [] array){
        int [] reversed = new int[array.length];
        int j = array.length;
        for (int i = array.length-1; i > -1; i-- ){
            reversed[j-1] = array[i];
            j--;
        }
        for (int i =0; i< reversed.length; i++){
            System.out.println(reversed[i]);
        }



    }


    public static void reverse(int [] array){
        int [] reversedArray = new int[array.length];
/*
        for (int a = 0; a < array.length; a++){
            //System.out.println(array[a]);
        }*/
        int i = array.length-1;
        while( i != -1 ){
            for (int a = 0; a < array.length; a++){
                reversedArray[a] = array[i];
            }
        i--;

        }
        System.out.println(Arrays.toString(reversedArray));

    }
}
