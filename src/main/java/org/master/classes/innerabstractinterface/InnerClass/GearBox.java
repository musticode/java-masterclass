package org.master.classes.innerabstractinterface.InnerClass;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int gearNumber = 0;
    private int currentGear = 0;
    private boolean clutchIn;

    public GearBox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void addGear(int gear, double ratio){
        if ((gear > 0) && (gear <=  maxGears) ){
            this.gears.add(new Gear(gear, ratio));
        }
    }

    public void changeGear(int newGear){
        if ((newGear > 0) && (newGear <= maxGears) ){
            this.currentGear = newGear;
        }
    }


    GearBox mcLaren = new GearBox(6);


}

class Gear2{
    private int gearNumber;
    private double ratio;

    public Gear2(int gearNumber, double ratio){
        this.gearNumber = gearNumber;
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    public int getGearNumber() {
        return gearNumber;
    }

    public double driveSpeed(int revs){
        return  revs * (this.ratio);
    }
}
