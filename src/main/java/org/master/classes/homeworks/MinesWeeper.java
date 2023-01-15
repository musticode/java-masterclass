package org.master.classes.homeworks;

import java.util.Random;
import java.util.Scanner;

public class MinesWeeper {
    public static void main(String[] args) {

        /**
         * Oyun alanı ve bomba bilgilerini tutmak için iki ayrı çift boyutlu char dizisi
         */
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
        for (int i = 0; i < gameArea.length; i++){
            for (int j = 0; j < gameArea.length; j++){
                System.out.print(bombInfo[i][j]);
            }
            System.out.println();
        }


        for (int i = 0; i < gameArea.length; i++){
            for (int j = 0; j < gameArea.length; j++){
                int bombCount = 0;
                if (bombInfo[i][j] == 'B'){
                    if ((i - 1) > 0){
                        bombInfo[i][j] = (char) bombCount;
                        bombCount++;
                    }
                    if ((i + 1) < 6){
                        bombInfo[i][j] = (char) bombCount;
                        bombCount++;
                    }



                }
            }
        }




        /**
         * 1B1B21
         * 00113B
         * 111B21
         * B11110
         * 14B100
         * BB2100
         */



        /**
         * Oyunumuz başlıyor
         */
        System.out.println("Mayın tarlasına hoşgeldiniz");
        Scanner sc = new Scanner(System.in);

        while(true) {

            /**
             * Oyun alanını ekrana bastır
             */
            for(int  i = 0; i < 6; i++) {
                for(int  j = 0; j < 6; j++) {
                    System.out.print(gameArea[i][j]);
                }
                System.out.println();
            }

            System.out.println("Lütfen açmak istediğiniz satır ve sutunu giriniz");
            /**
             * Kullanıcı arada boşluk olacak şekilde 4 2 benzeri koordinatları girecek
             */
            String coordinates = sc.nextLine();
            /**
             * Boşluğa göre parçalayıp satır ve sutunu bulabiliriz.
             */
            String[] coordinatesPart = coordinates.split(" ");

            String satır = coordinatesPart[0];
            String sutun = coordinatesPart[1];

            int satırNumara = Integer.valueOf(sutun);  //satir olacak
            int sutunNumara = Integer.valueOf(sutun);

            /**
             * Bu yerde bomba var mı kontrol et
             * gelen koordinatların bir eksiği bizim dizimizde index olacak 0'dan başladığında dolayı
             */
            if(bombInfo[satırNumara - 1][sutunNumara - 1] == 'B') {
                /**
                 * Oyun bitti
                 */

                System.out.println("Game over");
            }else {
                /**
                 * Bomba yok, oyuna devam, gameArea dizisinden buraya artık yıldız basılmamalı bundan dolayı
                 * yıldız basılan hücrenin artık komşu bomba sayısını göstermesi gerekmektedir.
                 * Yani bombInfo'da yazan komşu hücre bomba sayısı bilgisini gameArea dizisine yazmalıyız bu hücre için.
                 */
                gameArea[satırNumara - 1][sutunNumara - 1] = bombInfo[satırNumara - 1][sutunNumara - 1];
            }

            /**
             * Bomba olmayan tüm hücreker açıldı ise oyunu sonlandır
             * Yoksa başa dön
             */

        }

    }

}
