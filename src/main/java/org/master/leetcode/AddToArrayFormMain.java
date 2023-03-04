package org.master.leetcode;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormMain {
    public static void main(String[] args) {


    /**
     * Input: num = [2,7,4], k = 181
     * Output: [4,5,5]
     * Explanation: 274 + 181 = 455
     * */

    int [] testArr = {1,2,0,0};
    int k = 34;

    List<Integer> newTestList = addToArrayForm(testArr, k);

    for (int a: newTestList) {
        System.out.println(a);
    }


    //System.out.println("pow "+ (int) Math.pow(10, 3));

    }


    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> newList = new ArrayList<>();

        int pow = (int) Math.pow(10, num.length-1);

        int index = 0;
        int sumOfArr = 0;

        while (pow > 0){

            sumOfArr += (num[index] * pow);

            pow = pow / 10;
            index++;

        }

        int lastTotal = k + sumOfArr;  //1234

        //newList.add(lastTotal);

        int pow2 = (int) Math.pow(10, num.length-1);
        while(lastTotal > 0){

            lastTotal %= pow2;
            pow2 /= 10;
        }



/*
        while(pow2 > 0){
            int basamak = lastTotal % pow2/10;
            System.out.println("basamak" + basamak);
            pow2 /= 10;
            //newList.add(lastTotal % pow2);
            //pow2 /= 10;
        }
*/





        return newList;
    }



}
