package org.master.classes.homeworks.Hw4;

public class Circle {

    private int radius;

    public Circle(int radius){
        if (radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int calculateArea(int radius){
        return (int) (Math.PI * Math.pow(radius, 2));
    }

    public int calculatePerimeter(int radius){

        int perimeter = (int) (2 * Math.PI * radius);
        return perimeter;
    }


    public void information(){
        System.out.println("This is a circle");
        System.out.println("Radius: "+ radius);
        System.out.println("Area: "+ calculateArea(radius));
        System.out.println("Perimeter: " + calculatePerimeter(4));
    }

}
