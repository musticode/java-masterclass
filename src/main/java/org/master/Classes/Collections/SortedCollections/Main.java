package org.master.Classes.Collections.SortedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        //stock item
        StockItem temp = new StockItem("bread", 0.86);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10);
        stockList.addStock(temp);

        temp = new StockItem("car", 1.10);
        stockList.addStock(temp);

        temp = new StockItem("cup  ", 1.10);
        stockList.addStock(temp);

        temp = new StockItem("chair", 1.10);
        stockList.addStock(temp);

        temp = new StockItem("door", 1.10);
        stockList.addStock(temp);

        temp = new StockItem("phone", 1.10);
        stockList.addStock(temp);

        temp = new StockItem("towel", 1.10);
        stockList.addStock(temp);

        temp = new StockItem("vase", 1.10);
        stockList.addStock(temp);

        /**
         * stock item print
         */
        System.out.println(stockList);

        for (String s : stockList.Items().keySet()){
            System.out.println(s);
        }
        Basket basket = new Basket("test");
        sellItem(basket, "car", 1);
        System.out.println(basket);

        sellItem(basket, "car", 1);
        System.out.println(basket);

        sellItem(basket, "car", 1);
        sellItem(basket, "spanner", 5);
        System.out.println(basket);

        sellItem(basket, "juice", 4);
        sellItem(basket, "cup", 12);
        sellItem(basket, "bread", 1);
        System.out.println(basket);
        System.out.println(stockList);



        /**
         * collections google search
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(1);

        Collections.sort(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //geeks work
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(111, "bbbb", "surname1"));
        studentArrayList.add(new Student(131, "bbbb", "surname2"));
        studentArrayList.add(new Student(121, "bbbb", "surname3"));

        for (int i = 0; i < studentArrayList.size(); i++ ){
            System.out.println(studentArrayList.get(i));
        }
        Collections.sort(studentArrayList, new Sorted());
        System.out.println("\nSorted");
        for (int b = 0; b < studentArrayList.size(); b++){
            System.out.println(studentArrayList.get(b));
        }
    }

    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if (stockItem == null){
            System.out.println("we dont sell "+ item);
            return 0;
        }

        if (stockList.sellStock(item, quantity) != 0 ){
            basket.addToBasket(stockItem, quantity);
            return  quantity;
        }
        return 0;
    }

}
