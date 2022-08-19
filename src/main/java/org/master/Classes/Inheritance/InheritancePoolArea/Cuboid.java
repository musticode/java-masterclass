package org.master.Classes.Inheritance.InheritancePoolArea;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if(height < 0){
            this.height =0;
        }else{
            this.height = height;
        }
    }

    public double getHeight() {
        if (height < 0){
            return 0;
        }else{
            return height;
        }
    }

    public double getVolume(){
        return getArea() * getHeight();
    }

}
