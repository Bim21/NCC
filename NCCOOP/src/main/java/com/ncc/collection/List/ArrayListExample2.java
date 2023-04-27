package com.ncc.collection.List;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        System.out.println("ArrayList elements: " + arrayList);
        System.out.println("ArrayList size: " + arrayList.size());
        arrayList.add("grape");
        System.out.println("ArrayList elements after adding grape: " + arrayList);
        System.out.println("ArrayList size after adding grape: " + arrayList.size());
        arrayList.remove(2);
        System.out.println("ArrayList elements after removing orange: " + arrayList);
        System.out.println("ArrayList size after removing orange: " + arrayList.size());
    }
}
