package com.ncc.collection.Map;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Random;

public class HashSetvsHashMap {

    public static void main(String[] args) {
        Random random = new Random();

        // HashSet add
        long startTime = System.nanoTime();

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(random.nextInt());
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("HashSet add duration: " + duration + " ms");

        // HashSet access
        startTime = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            hashSet.contains(random.nextInt());
        }

        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("HashSet access duration: " + duration + " ms");

        // HashMap add
        startTime = System.nanoTime();

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            hashMap.put(random.nextInt(), i);
        }

        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("HashMap add duration: " + duration + " ms");

        // HashMap access
        startTime = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            hashMap.containsKey(random.nextInt());
        }

        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("HashMap access duration: " + duration + " ms");
    }
}

