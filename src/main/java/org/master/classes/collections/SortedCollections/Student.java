package org.master.classes.collections.SortedCollections;

import java.util.Comparator;

public class Student {
    int rollNo;
    String name;
    String surname;

    public Student(int rollNo, String name, String surname){
        this.rollNo = rollNo;
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        return this.rollNo + " " + this.name + " " + this.surname;
    }


}

class Sorted implements Comparator<Student> {

    public int compare(Student a, Student b){
        return a.rollNo - b.rollNo;
    }

}
