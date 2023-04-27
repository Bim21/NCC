package com.ncc.collection.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("apple");
        set.add("pear");
        set.add("orange");
        set.add("grape");
        System.out.println(set);
    }
}
