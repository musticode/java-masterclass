package org.master.Classes.Homeworks;

public class Hw1 {
    public static void main(String[] args) {
        System.out.println("------1-------");
        int number = 4;

        for (int i = 0; i < 100; i++){
            if (i % number == 0 ){
                System.out.println(i);
            }
        }

        System.out.println("------2-------");

        /*
        * 1
        * 23
        * 456
        * 78910
        * 1112131415*/

        int triangleSize = 5;
        int [] arr = new int[15];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i+1;
            System.out.print(arr[i]);
        }

        System.out.println("\ntriangle");
        for (int i = 1; i <= triangleSize; i++ ){
            for (int j = 1; j <= i; j++ ){
                //System.out.print(j);
                System.out.print(arr[i+j]);
            }
            System.out.println();
        }


        System.out.println("\ntriangle 2");
        int size = 4;
        int triangleNumber = 1;

        for (int i = 1; i <= size; i++ ){
            for (int j = 1; j <= i; j++ ){
                System.out.print(triangleNumber);
                triangleNumber = triangleNumber + 1;
                //++triangleNumber;
            }
            System.out.println();
        }

        System.out.println("\ntriangle 3");
        int rows = 5, number2 = 1;

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= i; j++) {

                System.out.print(number2 + " ");
                ++number2;
            }

            System.out.println();
        }


        /*
        * Üçüncü kısımda elimizde iki tane integer değişkenimiz olacak ve bunların değeri 3 basamaklı
herhangi bir sayı olacaktır. Sizden beklediğim bu sayıların aynı basamağında aynı rakam varsa
ekrana ortak rakam vardır şeklinde bir şey yazdırmanızdır. Yoksa bir şey yazdırmanıza gerek
yoktur.
Mesela sayılar 112 ve 215 olsun bunların onlar basamağında aynı rakam olduğu için ekrana
mesaj yazacaktır. Sayılarımız 304 ve 213 olduğunda aynı basamaklara denk gelen aynı rakam
olmadığı için mesajı yazmayacaktır.*/

        System.out.println("-------3-------");
        int numA = 112;
        int numB = 215;



        int c = 0;

        while (numA > 0){
            int digitA = numA % 10;
            numA = numA / 10;

            System.out.println(numA + " digit: "+ digitA);

            //int c2 = 0;
            while (numB > 0){
                int digitB = numB % 10;
                numB = numB / 10;
                System.out.println(numB + " digit: "+ digitB);

                if (digitA == digitB){
                //    System.out.println("digitB "+digitB);
                    c++;
                    System.out.println("TTTTTT");
                    break;
                }

                c++;
            }



            c++;
        }

        System.out.println(numA);

/**
*
*
* */
        System.out.println("44444-5-5-5-213--213-42-42");

        int a = 123;
        int b = 221;

        int co = 0;
        while (a > 0){
            int digita = a % 10;
            a = a / 10;

            int digitb = b % 10;
            b = b / 10;
            if (digita == digitb){
                System.out.println(digita + " : " + digitb);
                break;
            }
            co++;

        }



        System.out.println("4444444");
        int originalNumber = 123;

        //printing the given number to be checked
        System.out.println("Given number: "+originalNumber);

        //keep a copy of original number
        int copyOfOriginalNumber = originalNumber;

        //initializing count as 1
        int count =0;

        //compare each digit with others
        //we will start comparing from rightmost digit with leftmost digits
        while (originalNumber > 0){

            //get the rightmost digit
            int digit = originalNumber % 10;

            //remove the rightmost digit and get the updated number
            originalNumber = originalNumber / 10;

            //assign the updated original number(rightmost digit removed) to a temp variable
            int temp = originalNumber;

            //check if the rightmost digit matches with leftmost digits
            while (temp > 0){

                //if rightmost digit matches with any leftmost digit then
                //increment count value
                //and break
                if (temp % 10 == digit){
                    count = 1;
                    break;
                }

                //remove rightmost digit from temp
                //and get updated temp value
                temp = temp / 10;
            }
        }
        //if count value is 1 then print given number is unique number
        if (count == 0){
            System.out.println(copyOfOriginalNumber+" is a unique number");
        }

        //else print given number is not a unique number
        else {
            System.out.println(copyOfOriginalNumber+" is not a unique number");
        }





/*
* Son kısmında elimizde bir integer sayı olacak arkadaşlar. Ve bizde bu sayının asal olup
olmadığını bulmaya çalışacağız. Eğer sayı asal değil ise sayı asal değildir şeklinde bir mesaj
yazacağız. Eğer asal ise bir şey yazdırmamıza gerek yoktur. (Burada break kullanmanızı
bekliyorum)*/
        System.out.println("------4----------");

        int primeNumber = 17;
        for (int i = 2; i < primeNumber; i++){
            if (primeNumber % i == 0 ){ //15 % 3  0;
                System.out.println("NOT PRIME");
                break;
            }
        }



/*
        int r1 = 0;
        int count = 0;
        while(numA < 0){
            r1 = numA % 10;
            count++;
        }
        System.out.println("r1"+r1);



        int counter = 0;
        while(numA > 0){
            numA = numA / 10;
            System.out.println(numA);
            counter++;
        }
        System.out.println(counter);
*/

    }
}
