package org.master.Classes.Collections.SortedCollections;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock = 0; //can be initialized later

    public StockItem(String name, double price){
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantityStock(){
        return quantityStock;
    }

    public void setPrice(double price){
        if (price > 0.0){
            this.price = price;
        }
    }

    public void adjustStock(int quantity){
        int newQuantity = this.quantityStock + quantity;
        if (newQuantity >= 0){
            this.quantityStock = newQuantity;
        }
    }

    public boolean equals(Object obj){
        System.out.println("entering stockitem.equals");
        if (obj == this){
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }


    @Override
    public int compareTo(StockItem o) {
        return 0;
    }
}