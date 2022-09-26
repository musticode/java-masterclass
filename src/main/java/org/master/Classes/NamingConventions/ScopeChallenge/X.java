package org.master.Classes.NamingConventions.ScopeChallenge;

public class X {
    private int x;

    public X(int x){
        this.x = x;
    }

    public void x(){
        for (int i = 0; i < 10; i++){
            System.out.println(i + this.x);
        }
    }

}
