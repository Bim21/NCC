package com.ncc.collection.Set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        System.out.println(numbers);
        //lấy tất cả các phần tử lớn hơn hoặc bằng một phần tử cụ thể.
        System.out.println(numbers.tailSet(15));
        //lấy phần tử đầu tiên
        System.out.println(numbers.first());
        //loại bỏ phần tử đầu tiên
        System.out.println(numbers.pollFirst());
        System.out.println(numbers);

    }

}
