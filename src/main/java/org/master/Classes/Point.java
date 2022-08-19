package org.master.Classes;

//import sun.tools.java.Parser;

public class Point {
    private int x;
    private int y;

    public Point(){
        //0,0
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public double distance(){
        return Math.sqrt((0 - y ) * (0 - y) + (0 - x) * (0 - x));
    }

    public double distance(int a, int b){
        return Math.sqrt((b - y ) * (b - y) + (a - x) * (a - x));
    }


}
