package org.master.classes.namingconventions.scopechallenge;

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
