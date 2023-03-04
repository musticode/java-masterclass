package org.master.classes.homeworks.w3.interfaces;

public class Pokemon implements Equipment{

    private String name;
    private int attackPower;

    public Pokemon(String name, int attackPower){

        this.name = name;
        if (attackPower < 0){
            attackPower = 0;
        }
        this.attackPower = attackPower;

    }


    @Override
    public void harmEnemy(Gamer enemy) {

        int harmAfterAttack = enemy.getHealth() - this.attackPower;

        enemy.setHealth(harmAfterAttack);
    }

    @Override
    public void info() {
        System.out.println("Name: "+ this.name + " Attack power: " +this.attackPower);
    }
}
