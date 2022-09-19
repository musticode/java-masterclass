package org.master.Classes.Generics.Challenge;

import java.util.ArrayList;

public class Team <T extends Player>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private ArrayList<T> members = new ArrayList<T>();

    public Team(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean addMember(T player){
        if (members.contains(player)){
            System.out.println("player is already in team");
            return false;
        }else {
            members.add(player);
            System.out.println("player is added to team");
            return true;
        }
    }

    public int numPlayer(){
        return this.members.size();
    }





}
