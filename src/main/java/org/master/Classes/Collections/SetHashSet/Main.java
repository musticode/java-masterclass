package org.master.Classes.Collections.SetHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 255);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 465);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Callisto", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);


        tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);


       tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        for (HeavenlyBody planet: planets){
            System.out.println(planet);
        }

        HeavenlyBody pluto = new DwarfPlanet("Pluto" ,482);
        planets.add(pluto);


        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        //should be true
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));

        //should be false
        System.out.println(pluto.equals(earth1));





/*
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 255);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempMoon.addSatellite(tempMoon);

        //
        System.out.println("Planets");
        for(HeavenlyBody planet: planets){
            System.out.println("\t"+ planet.getName());
        }

        //
        HeavenlyBody body = solarSystem.get("Venus");
        System.out.println("Moons of "+ body.getName());
        for (HeavenlyBody jupiterMoon: body.getSatellites()){
            System.out.println("\t"+ jupiterMoon.getName());
        }

        //
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet: planets){
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All moons");
        for(HeavenlyBody moon: moons){
            System.out.println("\t"+ moon.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 482);
        planets.add(pluto);

        for (HeavenlyBody planet: planets){
            System.out.println("\t"+ planet.getName() + " : " + planet.getOrbitalPeriod());
        }

        Object o = new Object();
        o.equals(o);
        "pluto".equals("");*/





    }
}


