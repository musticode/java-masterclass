package org.master.classes.innerabstractinterface.AbstractClass.Challenge;

public class SearchTree implements NodeList{

    private ListItem root = null;

    public SearchTree(ListItem root){
        this.root = root;

    }


    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if (root != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
