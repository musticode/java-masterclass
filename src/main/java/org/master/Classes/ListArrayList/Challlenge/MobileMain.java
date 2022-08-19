package org.master.Classes.ListArrayList.Challlenge;

import java.util.Scanner;

public class MobileMain {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("000 555 44 33");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("actions:");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added " + name + phoneNumber);
        }else{
            System.out.println("Can't added");
        }
    }

    private static void updateContact(){
        System.out.println("enter existing contact ");
        String name = scanner.nextLine();
//        mobilePhone
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("enter new contact phone number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("successfully updated");
        }else{
            System.out.println("error when updating");
        }
    }

    private static void removeContact(){
        System.out.println("enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("contact not found");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("successfully deleted");
        }else{
            System.out.println("not deleted");
        }

    }

    private static void queryContact(){
        System.out.println("enter existing name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("contact  not found");
            return;
        }

        System.out.println("name: " + existingContactRecord.getName() + " phone: " + existingContactRecord.getPhoneNumber());



    }


    private static void startPhone(){
        System.out.println("Starting phone");
    }

    private static void printActions(){
        System.out.println("Available actions: ");
        System.out.println("0 - shutdown\n" +
                "1 - print contacts\n"+
                "2 - add new\n"+
                "3 - update existing\n"+
                "4 - remove\n"+
                "5 - query if existing contact\n"+
                "6 - print list of actions");
        System.out.println("choose action: ");
    }

}
