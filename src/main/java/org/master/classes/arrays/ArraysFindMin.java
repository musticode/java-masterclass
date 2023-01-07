package org.master.classes.arrays;

import java.util.Scanner;

public class ArraysFindMin {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
/*
        int [] array1 = new int[5];
        int [] array2 = array1;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        array2 = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(array2));
*/

        System.out.println("enter val:");
//        readElements(readInteger());
        findMin(readElements(readInteger()));




    }
    // 10
    /* {2,4,6,1,7} */



    private static int findMin(int [] arrayToFindMin){
        int min = 10;

        for (int i = 0; i< arrayToFindMin.length; i++){
            int value = arrayToFindMin[i];

            if (value < min){
                min = value;
            }
        }
        return min;
    }

    private static int [] readElements(int count){
        int [] array = new int[count];
        for (int i=0; i< array.length; i++){
            System.out.println("Enter number: ");
            int scannedNumber = scanner.nextInt();
            array[i] = scannedNumber;
        }
        return array;
    }



    private static int readInteger(){
        int count = scanner.nextInt();
        return count;
    }






    private int findMin1(int [] arrayToFindMin){
        int max = Integer.MAX_VALUE;

        for (int i=0; i < arrayToFindMin.length; i++){
            int value = arrayToFindMin[i];
            if (value < max){
                max = value;
            }
        }
        return max;


    }


    public static int [] readIntegers(int count){
        int [] arr = new int[count];
        for (int i= 0; i < arr.length; i++){
            System.out.println("Enter numbers: ");
            int number = scanner.nextInt();
            arr[i] = number;
        }
        return arr;
    }
}
