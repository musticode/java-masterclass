package org.master.classes.basicinputoutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsMain {
    public static void main(String[] args) {

        int x = 98;
        int y = 0;

        System.out.println(divideLYBL(x,y));
        System.out.println(divideEAFP(x,y));

        // int c = getIntLYBL();
       // System.out.println("c is: " + c );

        int c2 = getIntEAFP();
        System.out.println("c is: " + c2 );

    }

    private static int getIntEAFP(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        try{
            return scanner.nextInt();
        } catch (InputMismatchException e){
            return 0;
        }
    }



    private static  int getIntLYBL(){
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer: ");
        String input = s.next();
        for (int i = 0; i < input.length(); i++){
            if (!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }

        if (isValid){
            return Integer.parseInt(input);
        }

        return 0;
    }




    private static int divideLYBL(int x, int y){
        if(y != 0 ){
            return x / y;
        }else{
            return 0;
        }
    }


    private static int divideEAFP(int x, int y){
        try {
            return x / y;
        }catch (ArithmeticException e ){
            return 0;
        }
    }



}
