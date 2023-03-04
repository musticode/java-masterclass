package org.master.classes.homeworks.w3.interfaces;

public class Stone implements Equipment{

    private int attackPower;

    public Stone(int attackPower){

        if(attackPower < 0) {
            attackPower = 0;
        }
        this.attackPower = attackPower;

    }


    @Override
    public void harmEnemy(Gamer enemy) {

        /**
         * harmed = 100(enemy's healt) - 3(attack power) --> 97
         *
         * */

        int harmed = enemy.getHealth() - this.attackPower;

        enemy.setHealth(harmed);


    }

    @Override
    public void info() {
        System.out.println("Stone: attack power " + this.attackPower);
    }
}
