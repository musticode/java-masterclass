package org.master.Classes.ListArrayList.Challlenge;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    public void printContacts(){
        for (int i = 0; i < this.myContacts.size(); i ++){
            System.out.println((i+1) +". "+
                    this.myContacts.get(i).getName() + "->"+
                    this.myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("contact is in the list");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if (foundPosition < 0 ){
            System.out.println(contact.getName() + "Contact was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }


    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);

        if (foundPosition < 0){
            System.out.println("Contact was not found");
            return false;
        }else if (findContact(newContact.getName()) != -1){
            System.out.println("Contact with name "+ newContact.getName() +
                    " already exists. Not updated");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println("Contact is set with "+ newContact.getName());
        return true;
    }

    public String queryContact(Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if (position >= 0 ){
            return this.myContacts.get(position);
        }
        return null;

    }




}
