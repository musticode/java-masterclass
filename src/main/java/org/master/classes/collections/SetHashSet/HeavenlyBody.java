package org.master.classes.collections.SetHashSet;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    //private final String name;
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    //private BodyTypes bodyType;

//    public static final int STAR = 1;
//    public static final int PLANET = 2;
//    public static final int DWARF_PLANET = 3;
//    public static final int MOON = 4;
//    public static final int COMET = 5;
//    public static final int ASTEROID = 6;

    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }


    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType){
        this.key = new Key(name, bodyType);
        //this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        //this.bodyType = bodyType;

    }



    public double getOrbitalPeriod(){
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    public boolean addSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites(){
        return new HashSet<>(this.satellites);
    }



    public final boolean equals(HeavenlyBody obj ){
        if (this == obj){
            return true;
        }

//        System.out.println("obj.getClass() " + obj.getClass());
//        System.out.println("this.getClass() " + this.getClass());
//        if ((obj == null) || (this.getClass() != obj.getClass())) {
//            return false;
//        }

        if (obj instanceof  HeavenlyBody){
            HeavenlyBody theObject =(HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());

        }
        return false;

//        String objName = ((HeavenlyBody)obj).getName();
//        return this.name.equals(objName);
    }


    //hashcode
    public int hashCode(){
        System.out.println("hashcode called ");
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyTypes){
        return new Key(name, bodyTypes);
    }



    public String toString(){
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static final class Key{
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType){
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
             return bodyType;
        }

        @Override
        public boolean equals(Object o) {
            Key key = (Key) o;
            if (this.name.equals(key.getName())){
                return (this.bodyType == key.getBodyType());
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public String toString() {
            return "Key{" +
                    "name='" + this.name + '\'' +
                    ", bodyType=" + this.bodyType +
                    '}';
        }

    }


}

