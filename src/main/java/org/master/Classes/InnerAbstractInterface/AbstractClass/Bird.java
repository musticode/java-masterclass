package org.master.Classes.InnerAbstractInterface.AbstractClass;

public abstract class Bird extends Animal implements CanFly{

    public Bird(String name){
        super(name);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathe in breathe out");
    }

    @Override
    public void canFly() {
        System.out.println(getName() + " flapping with wings");
    }
}
