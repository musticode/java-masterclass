package org.master.classes.innerabstractinterface.AbstractClass.Challenge;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse (ListItem root);

}
