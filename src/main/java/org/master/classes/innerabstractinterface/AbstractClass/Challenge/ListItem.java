package org.master.classes.innerabstractinterface.AbstractClass.Challenge;

public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value){
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public void setValue(Object value){
        this.value = value;
    }


    public Object getValue(){
        return  value;
    }


}
