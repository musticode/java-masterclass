package org.master;

public class While {
    public static void main(String[] args) {
        //while
        int count = 1;
        while(count != 6){
            System.out.println("count "+ count);
            count++;
        }

        int countWhile2 = 1;
        while(true){
            if (count == 6){
                break;
            }
        }


        //for
        for(int i = 0; i != 6; i++){
            System.out.println(i);
        }


    }

}
