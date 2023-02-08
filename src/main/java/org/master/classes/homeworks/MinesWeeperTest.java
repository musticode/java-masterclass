package org.master.classes.homeworks;

import java.util.Random;

public class MinesWeeperTest {

    public static void main(String[] args) {

        char[][] gameArea = new char[6][6];
        char[][] bombInfo = new char[6][6];

        /**
         * Kullanıcıya gösterilecek oyun alanını başta *'larla doldur.
         */
        for(int  i = 0; i < 6; i++) {
            for(int  j = 0; j < 6; j++) {
                gameArea[i][j] = '*';
            }
        }

        /**
         * 8 tane rastgele yere bomba yerleştir.
         */
        for(int i = 0; i < 8; i++) {
            Random r = new Random();
            int bombaSatır = r.nextInt(6);
            int bombaSutun = r.nextInt(6);
            /**
             * Burada bomba olduğunu b harfi ile belirtiyorum
             */
            bombInfo[bombaSatır][bombaSutun] = 'B';
        }

        /**
         * Burada bomba yerleştirdikten sonra hemen bombasız kalan diğer hücrelerin komşu hücrelerindeki bomba sayısını hesaplayıp
         * bombInfo dizisinde oraları sayının char hali ile güncellemeniz gerekmektedir. Size bırakıyorum burayı.
         * İşin en oöenmli kısmı burası!!! Her hücreyi gezip komşularında ne kadar bomba varsa hücrenin değerini güncellemeniz gerekmektedir.
         * gameArea = '*'
         */


        //bomb info print
        System.out.println("bomb info");
        for (int i = 0; i < gameArea.length; i++){
            for (int j = 0; j < gameArea.length; j++){
                System.out.print(bombInfo[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < gameArea.length; i++){
            for (int j = 0; j < gameArea.length; j++){



            }
        }


    }
}
