package org.master.classes.homeworks.Hw4;

import java.util.Scanner;

public class MainHw4 {
    public static void main(String[] args) {


        System.out.println("TEST RECTANGLE");
        Rectangle r = new Rectangle(3,4);
        r.information();

        System.out.println("test triangle");
        Triangle t = new Triangle(3,4);
        t.information();

        System.out.println("test circle");
        Circle c = new Circle(3);
        c.information();


        boolean quit = false;
        while (!quit){
            Scanner scanner = new Scanner(System.in);

            printMenu();

            System.out.println("Select: ");
            int selectedShape = scanner.nextInt();

            if (selectedShape == 1 ){
                System.out.println("Enter 2 edge for rectangle: ");

                int edge1 = scanner.nextInt();
                int edge2 = scanner.nextInt();
                Rectangle rectangle = new Rectangle(edge1, edge2);

            }else if (selectedShape == 2 ){
                System.out.println("Enter 2 edge for triangle");
                int edge1 = scanner.nextInt();
                int edge2 = scanner.nextInt();
                Rectangle rectangle = new Rectangle(edge1, edge2);
            }




            if (selectedShape == 4){
                quit = true;
            }



        }






    }

    public static void printMenu(){
        System.out.println(
                "Dikdörtgen hesaplamaları için 1'e basınız\n" +
                "Üçgen hesaplamaları için 2'ye basınız\n" +
                "Çember hesaplamaları için 3'e basınız\n" +
                "Çıkmak için 4'e basınız."
        );
    }
}
