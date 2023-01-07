package org.master.classes.innerabstractinterface.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("test");
        dog.eat();
        dog.breathe();

        System.out.println("----------------------");
        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.canFly();

        Penguin penguin = new Penguin("peng");
        penguin.canFly();



    }
}
