package org.master.classes.homeworks;

import java.util.Random;

public class MinesWeeperTest {

    public static void main(String[] args) {

        char [][] arr = new char[4][4];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j]= 'a';
                //arr[i][j]= 2;
            }
        }


        /**
         *                 Random r = new Random();
         *                 int bomb = r.nextInt(3);
         *                 int bomb2 = r.nextInt(3);
         *
         *                 arr[bomb] [bomb2] = 'a';
         */


        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]);
            }

            System.out.println();
        }




    }
}
