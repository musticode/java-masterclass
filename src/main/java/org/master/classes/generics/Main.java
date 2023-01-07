package org.master.classes.generics;

public class Main {
    public static void main(String[] args) {
        FootBallPlayer joe = new FootBallPlayer("joe");
        BaseBallPlayer pat = new BaseBallPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team adeliaCrowds = new Team("Adelaide Crowds");


        Team<SoccerPlayer> brokenTeam = new Team<>("Brokenteam");
        brokenTeam.addMember(beckham);

        Team<FootBallPlayer> melbourne = new Team<>("Melbourne");
        FootBallPlayer banks = new FootBallPlayer("Banks");
        melbourne.addMember(banks);


        Team<FootBallPlayer> hawtorn = new Team<>("hawtorn");
        Team<FootBallPlayer> fremantle = new Team<>("fremantle");

        hawtorn.matchResult(fremantle,1,0);
//        hawtorn.matchResult();

        adeliaCrowds.matchResult(fremantle, 2, 1 );
//        adeliaCrowds.matchResult(, 2, 1 );


        System.out.println(adeliaCrowds.numPlayers());

        System.out.println("Rankings:\n");
        System.out.println(adeliaCrowds.getName() + ": " + adeliaCrowds.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawtorn.getName() + ": " + hawtorn.ranking());


        System.out.println(adeliaCrowds.compareTo(melbourne));
        System.out.println(adeliaCrowds.compareTo(hawtorn));
        System.out.println(hawtorn.compareTo(adeliaCrowds));
        System.out.println(melbourne.compareTo(fremantle));




    }
}
