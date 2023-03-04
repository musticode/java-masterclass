package org.master.classes.homeworks.w3.interfaces;

public class Game {

    private Gamer gamer1;
    private Gamer gamer2;


    Stone stone = new Stone(12);
    Pokemon pokemon = new Pokemon("Pikachu", 15);
    Pistol pistol = new Pistol("Sarsılmaz", 19);


    public Game(Gamer gamer1, Gamer gamer2){
        this.gamer1 = gamer1;
        this.gamer2 = gamer2;
    }

    public void start(){

        //gamer1
        gamer1.add(stone);
        gamer1.add(pokemon);
        gamer1.add(pistol);
//        gamer1.selectRandomEquipment().harmEnemy(gamer2);


        //gamer2
        gamer2.add(stone);
        gamer2.add(pokemon);
        gamer2.add(pistol);
//        gamer2.selectRandomEquipment().harmEnemy(gamer1);

        /**
         * SaldiriEkipmani ekipman = p1.rastgeleSaldiriEkipmaniSec();
         * p1.bilgiVer();
         * ekipman.bilgiVer();
         * ekipman.zararVer(p2);
         *
         *
         * SaldiriEkipmani p2Ekipman = p2.rastgeleSaldiriEkipmaniSec();
         * p2.bilgiVer();
         * p2Ekipman.bilgiVer();
         * p2Ekipman.zararVer(p1);
         *
         * */


        Equipment equipment1 = gamer1.selectRandomEquipment();
        Equipment equipment2 = gamer2.selectRandomEquipment();
        while (gamer1.getHealth() > 0 && gamer2.getHealth() > 0){

            //Equipment equipment1 = gamer1.selectRandomEquipment();
            System.out.println("Eq 1");
            equipment1.info();
            equipment1.harmEnemy(gamer2);



            //Equipment equipment2 = gamer2.selectRandomEquipment();
            System.out.println("Eq 2");
            equipment2.info();
            equipment2.harmEnemy(gamer1);



        }

        System.out.println("Winner ");
        gamer1.info();
        gamer2.info();

    }

}
