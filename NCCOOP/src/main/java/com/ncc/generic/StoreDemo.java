package com.ncc.generic;

import java.util.ArrayList;

public class StoreDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("PC");
        list.add("Phone");
        list.add("playstation");
        list.add("watch");
        System.out.println(Store.getFirstElement(list));
    }
}
