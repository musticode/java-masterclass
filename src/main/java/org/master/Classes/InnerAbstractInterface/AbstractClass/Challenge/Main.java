package org.master.Classes.InnerAbstractInterface.AbstractClass.Challenge;

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());


        //"Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra"
        String stringDAta = "5 7 3 9 8 2 1 0 4 6";
        String [] data = stringDAta.split(" ");
        for (String s: data){
            //create new item with value set to the string s
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());
    }
}
