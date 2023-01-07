package org.master.classes.innerabstractinterface.AbstractClass.Challenge;

public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root){
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null){//if the head of the list is empty, new item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0){
                //new item greater, returns -
                if (currentItem.getValue() != null){
                    currentItem = currentItem.next();
                }else {
                    //there is no next, last element of list
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                //new item is less, insert before
                if (currentItem.previous() != null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                }else{
                    // the node with a previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }else{
                //equal
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        //
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item !=null){
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
            if (comparison == 0){
                //found the item to delete
                if (currentItem == this.root){
                    this.root = currentItem.next();
                }else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison <0 ){
                currentItem = currentItem.next();
            } else {
                //comparison > 0
                //we are at an item greater than the one to be deleted, so the item is not in the list
                return false;
            }


        }

        //reached the end of the list
        //
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null){
            System.out.println("the list is empty");
        }else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
