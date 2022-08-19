package org.master.Classes.ListArrayList.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Customer customer = new Customer("Mustafa", 12.2);
//        Customer anotherCustomer;
//        anotherCustomer = customer;
//
//        anotherCustomer.setBalance(1.1);
//        System.out.println("Name:  "+ customer.getName() + ", balance is : "+customer.getBalance());

        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("ank");
        placesToVisit.add("ist");
        placesToVisit.add("esk");
        placesToVisit.add("izm");


        addInOrder(placesToVisit, "fong");
        printList(placesToVisit);
        visit(placesToVisit);



    }

    private static void printList(LinkedList<String> listToPrint){
        Iterator<String> iterator = listToPrint.iterator();
        while (iterator.hasNext()){
            System.out.println("visiting: "+ iterator.next());
        }
        System.out.println("--------------------------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
                System.out.println(newCity + "is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //move on next city
            }

        }
        stringListIterator.add(newCity);
        return true; /////
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        ListIterator<String> listIterator = cities.listIterator();
        if (cities.getFirst() == ""){
            System.out.println("no cities");
            return;
        }else{
            System.out.println("visiting " + listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            switch (action){
                case 0:
                    System.out.println("holiday is over");
                    quit = true;
                    break;
                case 1:
                    if (listIterator.hasNext()){
                        System.out.println("visiting: " + listIterator.next());
                    }else {
                        System.out.println("reached the end of the list");
                    }
                    break;
                case 2:
                    if (listIterator.hasPrevious()){
                        System.out.println("visiting: "+ listIterator.previous());
                    }else{
                        System.out.println("we are at the start of list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;

            }
        }

    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n"+
                "1 - go to next city"+
                "2 - go to previous city"+
                "3 - print menu options");
    }




}
