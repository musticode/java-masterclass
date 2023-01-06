package org.master.Classes.Collections.SortedCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Basket {
    private final  String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name){
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItem item, int quantity){
        if ((item != null) && (quantity > 0)){
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket+quantity);
            return inBasket;
        }
        return 0;
    }

    public Map<String, Double> PriceList(){
        Map<String, Double> prices = new LinkedHashMap<>();


        //integer error
        /**
        for (Map.Entry<String, StockItem> item: list.entrySet()){
            prices.get(item.getKey(), item.getValue().getPrice());
        }
        */

        return Collections.unmodifiableMap(prices);
     }

    public Map<StockItem, Integer> Items(){
        return Collections.unmodifiableMap(list);
    }

    public String toString(){

        String s = "\nShopping basket " + name + " contains " + list.size() + " items\n";

        //
        String s2 = "\nShopping basket " + name + " contains " + list.size() + (((list.size() == 1)) ? "item" : " items") + "\n";

        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item: list.entrySet()){
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;

    }






}
