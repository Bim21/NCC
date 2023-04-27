package com.ncc.collection.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("dog");
        set.add("cat");
        set.add("bird");
        set.add("elephant");
        set.add("ant");
        System.out.println(set);
    }
}
