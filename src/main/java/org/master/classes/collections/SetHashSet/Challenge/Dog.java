package org.master.classes.collections.SetHashSet.Challenge;

public class Dog {
    private final String name;

    public Dog(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Dog){
            String objName = ((Dog) obj).name;
            return this.name.equals(objName);
        }
        return false;
    }
}
