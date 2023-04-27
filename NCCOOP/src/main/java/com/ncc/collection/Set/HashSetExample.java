package com.ncc.collection.Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");

        System.out.println(hashSet);

        System.out.println(hashSet.contains("banana"));
        hashSet.remove("A");
        System.out.println(hashSet.size());
        hashSet.clear();
        System.out.println(hashSet.size());
    }
}
