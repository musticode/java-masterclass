package org.master;

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


}

