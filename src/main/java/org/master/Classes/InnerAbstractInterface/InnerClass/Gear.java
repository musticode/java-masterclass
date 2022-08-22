package org.master.Classes.InnerAbstractInterface.InnerClass;

public class Gear {
    private int gearNumber;
    private double ratio;

    public Gear(int gearNumber, double ratio){
        this.gearNumber = gearNumber;
        this.ratio = ratio;
    }

    public double driveSpeed(int revs){
        return revs * (this.ratio);
    }
}
