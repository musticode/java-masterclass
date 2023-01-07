package org.master.classes.collections.Overview;

public class Seat implements Comparable<Seat>{

    private String seatNumber;
    private double price;
    private boolean reserved = false;

    public Seat(String seatNumber, double price){
        this.seatNumber = seatNumber;
        this.price = price;

    }

    public String getSeatNumber(){
        return seatNumber;
    }

    public double getPrice(){
        return price;
    }

    public boolean reserve(){
        if (!this.reserved){
            this.reserved = true;
            System.out.println("Seat "+ seatNumber + " reserved");
            return true;
        } else {
            return false;
        }
    }

    public boolean cancel(){
        if (this.reserved){
            this.reserved = false;
            System.out.println("Seat "+ seatNumber + " cancelled");
            return true;
        }else {
            return false;
        }
    }


    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareTo(seat.seatNumber);
    }
}
