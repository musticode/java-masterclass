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

    }

    public void print(){

    }


}
