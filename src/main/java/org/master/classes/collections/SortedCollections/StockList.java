package org.master.classes.collections.SortedCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList(){
        this.list = new HashMap<>();
    }

    //add method
    public int addStock(StockItem item){
        if (item != null){
            //check if already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
            //StockItem inStock = list.get(item.getName());
            //if there are already stock on this item, adjust the quantity
            if (inStock != null){
                item.adjustStock(inStock.getQuantityStock());
            }
            list.put(item.getName(), item);
            return item.getQuantityStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity){
        StockItem inStock = list.getOrDefault(item, null);

        if ((inStock != null) && (inStock.getQuantityStock() >= quantity) && (quantity > 0)){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key){
        return list.get(key);
    }

    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(list);
    }

    public String toString(){
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()){
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.getQuantityStock();

            s = s + stockItem + ". There are " + stockItem.getQuantityStock() + " in stock. Value";
            s = s + itemValue + "\n";
            totalCost += itemValue;
        }
        return s + "Total stock value "+ totalCost;
    }


}
