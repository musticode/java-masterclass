package org.master.Classes.Collections.SortedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {


        //collections google search
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(1);

        Collections.sort(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //geeks work
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(111, "bbbb", "surname1"));
        studentArrayList.add(new Student(131, "bbbb", "surname2"));
        studentArrayList.add(new Student(121, "bbbb", "surname3"));

        for (int i = 0; i < studentArrayList.size(); i++ ){
            System.out.println(studentArrayList.get(i));
        }
        Collections.sort(studentArrayList, new Sorted());
        System.out.println("\nSorted");
        for (int b = 0; b < studentArrayList.size(); b++){
            System.out.println(studentArrayList.get(b));
        }
    }
}
