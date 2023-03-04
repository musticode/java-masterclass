package org.master.classes.homeworks.w3.interfaces;

public abstract class Weapon implements Equipment{
    private String brand;
    private int bullet;
    private int attackPower;



    public Weapon(String brand, int attackPower){
        this.brand = brand;

//        this.bullet = 2;
        if (attackPower < 0) {
            attackPower = 0;
        }
        this.attackPower = attackPower;
    }


    public int getAttackPower() {
        return attackPower;
    }

    public int getBullet() {
        return bullet;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void harmEnemy(Gamer enemy);




}
