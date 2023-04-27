package com.ncc.collection.List;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("apple");
        vector.add("banana");
        vector.add("orange");
        System.out.println("Vector elements: " + vector);
        System.out.println("Vector size: " + vector.size());
        System.out.println("Vector capacity: " + vector.capacity());
        vector.add("grape");
        System.out.println("Vector elements after adding grape: " + vector);
        System.out.println("Vector size after adding grape: " + vector.size());
        System.out.println("Vector capacity after adding grape: " + vector.capacity());
        vector.remove(2);
        System.out.println("Vector elements after removing orange: " + vector);
        System.out.println("Vector size after removing orange: " + vector.size());
        System.out.println("Vector capacity after removing orange: " + vector.capacity());
    }
}
