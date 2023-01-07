package org.master.classes.innerabstractinterface.Interface;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("no actions, no button in deskphone");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing " + phoneNumber + "on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the deskphone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
            System.out.println("ringing");
        }else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
