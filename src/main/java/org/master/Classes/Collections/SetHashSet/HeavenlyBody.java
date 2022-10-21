package org.master.Classes.Collections.SetHashSet;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private BodyTypes bodyType;

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
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;

    }


    public String getName(){
        return name;
    }

    public double getOrbitalPeriod(){
        return orbitalPeriod;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public boolean addSatellite(HeavenlyBody moon){
        if(moon.getBodyType() == BodyTypes.MOON){
            return this.satellites.add(moon);
        }else{
            return false;
        }

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
            if (this.name.equals(theObject.getName())){
                return this.bodyType == theObject.getBodyType();
            }
        }
        return false;

//        String objName = ((HeavenlyBody)obj).getName();
//        return this.name.equals(objName);
    }


    //hashcode
    public int hashCode(){
        System.out.println("hashcode called ");
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    public String toString(){
        return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod;
    }


}

