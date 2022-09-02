package org.master.Classes.InnerAbstractInterface.AbstractClass;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I'm not good at that");
    }
}
