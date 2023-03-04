package org.master.classes.homeworks.w3.interfaces;

import java.util.Random;

public class Gamer {

    private String name;
    private String surname;
    private int health;
    private Equipment [] equipmentArr = new Equipment[3];

    private int equipmentCounter = 0;


    public Gamer(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.health = 100;
    }


    public void setHealth(int health) {
        if (health < 0){
            health = 0;
        }
        this.health = health;
    }


    public int getHealth() {
        return health;
    }


    public Equipment selectRandomEquipment(){

        Random random = new Random();
        int randomNumber = random.nextInt(equipmentCounter);
        return equipmentArr[randomNumber];
    }


    public void add(Equipment equipment){

        if (equipmentCounter < 3){
            equipmentArr[equipmentCounter] = equipment;
            equipmentCounter++;
        }

    }

    public void info(){
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Health: "+ this.health );
    }



}
