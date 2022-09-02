package org.master.Classes.InnerAbstractInterface.AbstractClass;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void canFly() {
        System.out.println(getName() + " can not fly but swims");
    }
}
