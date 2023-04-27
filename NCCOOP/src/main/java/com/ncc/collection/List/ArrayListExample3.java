package com.ncc.collection.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {
    public static void main(String[] args) {
//        List<StringBuilder> list = new ArrayList<>();
//        list.add(new StringBuilder("A"));
//        list.add(new StringBuilder("B"));
//        list.add(new StringBuilder("C"));
//
//        for(StringBuilder item: list){
//            item=item.append("D");
//        }
//        System.out.println(list);

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String item : list) {
            item = item + "D";
        }
        System.out.println(list);


    }
}
