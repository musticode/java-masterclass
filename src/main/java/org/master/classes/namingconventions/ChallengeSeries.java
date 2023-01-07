package org.master.classes.namingconventions;

public class ChallengeSeries {
    public static long nSum(int n){
        return (n*(n+1))/2;
    }

    public static long factorial(int n){
        if (n == 0){
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            long fact = 1;
            for (int i = 0; i < n; i++){
                fact *= i;
            }
            return fact;
        }

    }





}
