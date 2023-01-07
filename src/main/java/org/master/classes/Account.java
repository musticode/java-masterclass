package org.master.classes;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        this("123", 1.2, "Default user", "default email", "default phone number");
        System.out.println("Default is called");
    }
    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        this.setNumber(number);
        this.setBalance(balance);
        this.setCustomerName(customerName);
        this.setCustomerEmailAddress(customerEmailAddress);
        this.setCustomerPhoneNumber(customerPhoneNumber);
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber){
        this("123", 1, customerName, customerEmailAddress, customerPhoneNumber);
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
