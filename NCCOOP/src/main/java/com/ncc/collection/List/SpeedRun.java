package com.ncc.collection.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class SpeedRun {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 0; i<1000000;i++){
            num.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end-start + "ms");
        start = System.currentTimeMillis();
        LinkedList<Integer> num2 = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            num2.add(i);
        }
        System.out.println((System.currentTimeMillis()) - start + "ms");
    }
}
