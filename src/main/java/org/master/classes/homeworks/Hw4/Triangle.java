package org.master.classes.homeworks.Hw4;

public class Triangle {

    private int verticalEdge1;
    private int verticalEdge2;

    public Triangle(int verticalEdge1, int verticalEdge2){
        if (verticalEdge1 < 0){
            verticalEdge1 = 0;
        }

        if (verticalEdge2 < 0){
            verticalEdge2 = 0;
        }

        this.verticalEdge1 = verticalEdge1;
        this.verticalEdge2 = verticalEdge2;
    }


    public int getVerticalEdge1() {
        return verticalEdge1;
    }

    public int getVerticalEdge2() {
        return verticalEdge2;
    }

    public int calculateArea(int verticalEdge1, int verticalEdge2){
        return (verticalEdge1 * verticalEdge2) / 2;
    }

    public int calculatePerimeter(int verticalEdge1, int verticalEdge2){
        int h = (int) (Math.pow(verticalEdge1, 2) + Math.pow(verticalEdge2, 2));
        return (int) Math.sqrt(h);
    }

    public void information(){

    }


}
