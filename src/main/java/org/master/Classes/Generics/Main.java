package org.master.Classes.Generics;

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


        System.out.println(adeliaCrowds.numPlayers());




    }
}
