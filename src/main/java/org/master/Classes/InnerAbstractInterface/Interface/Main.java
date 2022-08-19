package org.master.Classes.InnerAbstractInterface.Interface;

public class Main {
    public static void main(String[] args) {
        ITelephone mPhone = new DeskPhone(12345);
        mPhone.powerOn();
        mPhone.callPhone(12345);
        mPhone.answer();

        mPhone = new MobilePhone(1555);
        mPhone.powerOn();
        mPhone.callPhone(1555);
        mPhone.answer();
    }
}
