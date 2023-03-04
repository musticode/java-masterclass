package org.master.classes.homeworks.w3.interfaces;

public class Main {
    public static void main(String[] args) {

        Gamer gamer1 = new Gamer("Mustafa", "Karatas");
        Gamer gamer2 = new Gamer("Ahmet", "Mehmet");

        Game game = new Game(gamer1, gamer2);
        game.start();

    }
}
