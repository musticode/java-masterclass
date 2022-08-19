package org.master.Classes;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFullName(){
        if(firstName.equalsIgnoreCase("") && lastName.equalsIgnoreCase("")){ //(firstName.isEmpty())
            return "";
        }else if (firstName.equalsIgnoreCase("")){
            return lastName;
        } else if (lastName.equalsIgnoreCase("")) {
            return firstName;
        }

        return firstName+ " "+ lastName;
    }


    public int getAge() {
        if(age < 0 || age > 100){
            return 0;
        }
        return age;
    }

    public boolean isTeen(){
        if(age > 12 && age < 20 ){
            return true;
        }else{
            return false;
        }
    }

}
