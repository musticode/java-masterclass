package org.master;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class For {
    public static void main(String[] args) {
        sumOdd(1, 4); //
        //1 + 3;
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(1,-100));
        System.out.println(sumOdd(100,1000));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(10,5));


        List<Integer> arrayList1= new ArrayList<>();
        List<Integer> arrayList2= new ArrayList<>();


        List<Integer> arrayList3= new ArrayList<>();
        List<Integer> arrayList4= new ArrayList<>();



        arrayList1.add(5);
        arrayList1.add(6);
        arrayList1.add(7);

        arrayList2.add(3);
        arrayList2.add(6);
        arrayList2.add(10);

        arrayList3.add(17);
        arrayList3.add(28);
        arrayList3.add(30);

        arrayList4.add(99);
        arrayList4.add(16);
        arrayList4.add(18);



        System.out.println(compareTriplets(arrayList1, arrayList2));
        System.out.println(compareTriplets(arrayList3, arrayList4));




        //diagonal difference

       // int di = diagonalDifference();


        //mini max sum
        List<Integer> miniMaxList = new ArrayList<>();
        miniMaxList.add(256741038);
        miniMaxList.add(623958417);
        miniMaxList.add(467905213);
        miniMaxList.add(714532089);
        miniMaxList.add(938071625); // 2063136757 2744467344
        miniMaxSum(miniMaxList);


        staircase(4);

        System.out.println("Candles: ");
        List<Integer> candlesExample = new ArrayList<>();
        candlesExample.add(3);
        candlesExample.add(3);
        candlesExample.add(3);
        candlesExample.add(3);

        System.out.println(birthdayCakeCandles(candlesExample));


        System.out.println("Time conversion example");
        System.out.println(time2("01:05:45PM"));

        System.out.println("A very big sum problem");
        List<Long> veryBigSum = new ArrayList<>();
        //1000000001 1000000002 1000000003 1000000004 1000000005
        veryBigSum.add(1000000001L);
        veryBigSum.add(1000000002L);
        veryBigSum.add(1000000003L);
        veryBigSum.add(1000000004L);
        veryBigSum.add(1000000005L);
        //5000000015

        //System.out.println(aVeryBigSum(veryBigSum));

    }


    public static String time2(String s){

        int hourInt = Integer.parseInt(s.substring(0,2));
        String hourString = s.substring(0,2);

        if (hourInt < 13){
            for (int i = 13; i <= 23; i++ ){

            }
        }
        String convertedHourString = Integer.toString(hourInt);
        return convertedHourString;

    }



    public static String timeConversion(String s) {
        // Write your code here
        String last = "";

        String t = "";
        int hours ; //= Integer.parseInt(s.substring(0,2));

        //String hoursString = Integer.toString(hours);

        String hoursPm ="";

        if (s.contains("AM")){
            t = s.substring(0,8);
        }else if (s.contains("PM")){
            hours = Integer.parseInt(s.substring(0,2));

            if (hours  <= 11){



               t = "13"+s.substring(2,8);

               for (int i = 13; i <= 23; i++){
                   hoursPm = Integer.toString(i);

               }


                //for (int i = 13; i <= 24; i++){
                  //  hoursPm =Integer.toString(i);
                    //hoursPm = s.substring(0,2);
                //}
                //t = s.substring(0,8);
            }


        }







        return t;

    }


    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int numOfCandles = 0;

        Collections.sort(candles);
        int max = candles.get(candles.size()-1);



        for (int i = 0; i < candles.size(); i++){
            if (candles.get(i) == max){
                numOfCandles++;
            }
        }

        return numOfCandles;
    }


    public static int sumOdd(int start, int end){
        int sum = 0;
        int count = 0;

        if(start < 0 || end < 0 || start > end){
            return -1;
        }
        for(int i = start; i <= end; i++  ){
            if (isOdd(i)){
                count++;
                sum = sum+i;
            }
        }

        return sum;
    }



    public static boolean isOdd(int number){
        if(number < 0 ){
            return false;
        }
        if(number % 2 ==1 ){ //odd
            return true;
        }else{ //even
            return false;
        }

    }





        /*        isPrime(0);
        isPrime(1);
        isPrime(2);
        isPrime(3); //bozuk




        int count = 0;
        for(int i = 10; i < 30; i++){
            if (isPrime(i)){
                count++;
                System.out.println(i);
                if(count == 30){
                    break;
                }
            }
        }

    }



    public static boolean isPrime(int n){
        if(n == 1 || n == 0 ){
            return false;
        }
        for(int i = 2; i< n/2; i++){
            if(n % 2 != 0){
                System.out.println(n);
                break;
            }
        }
        return true;
    }*/

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> arrayList = new ArrayList<>();
        int sumA= 0;
        int sumB=0;
        arrayList.add(sumA);
        arrayList.add(sumB);

            for(int i=0; i < a.size(); i++ ){
                if (a.get(i) < 100 && b.get(i) < 100){
                    if(a.get(i) > b.get(i)){ //alice awarded
                        //arrayList.add(0);
                        arrayList.set(0, sumA + 1);
                        sumA++;
                    }else if(a.get(i) < b.get(i)){ //bob awarded
//                        arrayList.add(1);
                        arrayList.set(1, sumB + 1);
                        sumB++;
                    }else if (a.get(i) == b.get(i)){

                    }
                }


            }


        return arrayList;
    }

    public static void staircase(int n) {
        // Write your code here

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j < n-1-i){ // 0 < 4-1-0
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }


    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        // 1 2 3 4 5
        if (arr.size() > 4){

        }
        int sum = 0;
        long min = 0, max = 0;
        Collections.sort(arr);
        for (int i = 0; i < arr.size()-1; i++){
            min = min + arr.get(i) ;
        }

        for (int j = arr.size()-1; j > 0; j--){
            max = max + arr.get(j);
        }

        //sum = min + max;
        System.out.println(min + " "+ max );


    }




    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sumOfArrayElements = 0;

        for (int i = 0; i < ar.size(); i++){
            sumOfArrayElements = ar.get(i) + sumOfArrayElements;  // 0 1+0


        }


        return 0;
    }


    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sumOfDiagonal = 0;
        int diagonal1 = 0;
        int diagonal2 = 0;

        int size = 3;

        for (int i = 0; i < size-1; i++){

            for (int j = 0; j< size-1; j++){

                if (i == j){
                    diagonal1 =  arr.get(i).get(j) + arr.get(i).get(j) + diagonal1;
                }

                if (i == size - j - 1){
                    diagonal2 =  arr.get(i).get(j) + arr.get(i).get(j) + diagonal2;
                }

            }
        }



        return Math.abs(diagonal1 - diagonal2);
    }



}

