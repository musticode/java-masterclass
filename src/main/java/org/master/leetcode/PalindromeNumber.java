package org.master.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

public class PalindromeNumber {

    public static void main(String[] args) {

        int num = 121;
        //System.out.println(isPalindrome(num));

        int num2 = 12321;
        System.out.println(isPalindrome2(num2));

    }


    public static boolean isPalindrome2(int x){

        if(x < 0){
            return false;
        }

        ArrayList<Integer> list = new ArrayList<>();

        int basamak = 0;

        while (x > 0){
            basamak = x % 10;
            list.add(basamak);
            x /=10;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != list.get(list.size()-1 -i)){
                return false;
            }

        }

        return true;

    }


    public static boolean isPalindrome(int x) {


        int [] arr ;

        int basamak = 0;
        int numberCounter = 0;
        while (x > 0){
            basamak = x % 10; //121 % 10  -> 1 -- 12
            numberCounter++;
            System.out.println("basamak "+ basamak);
            x /=10;
        }


        //1 2 1
        arr = new int[numberCounter];
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++){
            arr[i] = basamak;
        }



        for (int i = 0; i < arr.length ; i++) { // 1
            if (arr[i] != arr[arr.length-1-i]){
                return false;
            }


//            for (int j = arr.length-1; j > i; j--) {
//                if (arr[i] != arr[j]){
//                    return false;
//                }
//            }
        }


        return true;
    }

}
