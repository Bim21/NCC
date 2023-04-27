package com.ncc.collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Khởi tạo một HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("a");
        hashSet.add("d");
        hashSet.add("e");

        System.out.println("HashSet:");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // Khởi tạo một LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("b");
        linkedHashSet.add("c");
        linkedHashSet.add("a");
        linkedHashSet.add("d");
        linkedHashSet.add("e");

        System.out.println("\nLinkedHashSet:");
        for (String element : linkedHashSet) {
            System.out.println(element);
        }
    }
}