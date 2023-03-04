package org.master.classes.homeworks.w3.interfaces;

public class Pistol extends Weapon implements Equipment{

    private int bulletCount;

    public Pistol(String brand, int attackPower) {

        super(brand, attackPower);
        this.bulletCount = 2;

    }



    @Override
    public void harmEnemy(Gamer enemy) {

        if(bulletCount > 0){
            int harmAfterAttack = enemy.getHealth() - getAttackPower();
            enemy.setHealth(harmAfterAttack);
            bulletCount--;
        }

    }

    @Override
    public void info() {
        System.out.println("Brand: " + this.getBrand() + " Bullet count: " + this.bulletCount);
    }
}
