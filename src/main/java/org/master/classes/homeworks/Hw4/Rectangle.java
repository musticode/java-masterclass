package org.master.classes.homeworks.Hw4;

public class Rectangle {
    private int shortEdge;
    private int longEdge;

    public Rectangle(int shortEdge, int longEdge){
        if (longEdge < 0 ){
            longEdge = 0;
        }
        if (shortEdge < 0){
            shortEdge = 0;
        }
        this.shortEdge = shortEdge;
        this.longEdge = longEdge;
    }


    public int getShortEdge() {
        return shortEdge;
    }

    public int getLongEdge() {
        return longEdge;
    }

    public int calculateArea(int shortEdge, int longEdge){
        return shortEdge * longEdge;
    }

    public int calculatePerimeter(int shortEdge, int longEdge){
        return (shortEdge + longEdge ) * 2;
    }

    public void information(){
        System.out.println("This is a rectangle");
        System.out.println("Short edge: "+shortEdge + " Long edge: "+longEdge);
        System.out.println("Area: "+ calculateArea(shortEdge, longEdge));
        System.out.println("Perimeter: " + calculatePerimeter(shortEdge, longEdge));
        print();
    }

    public void print(){
//
//        System.out.println("This is a rectangle");
//        System.out.println("Short edge: "+shortEdge + " Long edge: "+longEdge);
//        System.out.println("Area: "+ calculateArea(shortEdge, longEdge));
//        System.out.println("Perimeter: " + calculatePerimeter(shortEdge, longEdge));

        //printing rectangle in with *
        for (int i = 0; i < shortEdge; i++){
            for (int j = 0; j < longEdge; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
