package com.ncc.collection.Map;

import java.util.HashMap;
import java.util.Hashtable;

public class hashTableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("apple", 2);
        table.put("orange", 3);
        table.put("banana", 1);

        System.out.println("The value of apple is " + table.get("apple"));
        System.out.println("The size of the table is " + table.size());
        System.out.println("Is the table empty? " + table.isEmpty());

        table.remove("orange");
        System.out.println("The size of the table is " + table.size());

        System.out.println("The keys in the table are: ");
        for (String key : table.keySet()) {
            System.out.println(key);
        }

        System.out.println("The values in the table are: ");
        for (Integer value : table.values()) {
            System.out.println(value);
        }
    }
}



