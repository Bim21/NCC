package com.ncc.collection.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();

        arrayList.add("Peter");
        arrayList.add("Parker");
        arrayList.add("Mary");
        arrayList.add("Jane");
        arrayList.add("Harry");
        arrayList.add("Potter");
        //Them phan tu vao vi tri duoc chi dinh
        arrayList.add(2, "Uncle May");
        for (String s : arrayList) {
            System.out.println(s);
        }
        //Xoa phan tu tai vi tri chi muc da cho
        arrayList.remove(4);
        System.out.println("list sau khi xóa: ");
        for (String s : arrayList) {
            System.out.println(s);
        }
        //Lay phan tu tai vi tri chi muc
        System.out.println("phan tu duoc lay: " + arrayList.get(0));
        //Lay so luong phan tu hien co:
        System.out.println("so luong phan tu hien co: " + arrayList.size());
        //sua phan tu duoc chi dinh
        arrayList.set(2,"Ben Parker");
        System.out.println("list sau khi thay doi: ");
        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println(arrayList.indexOf(arrayList));
        arrayList.clear();
        System.out.println("list sau khi clear: ");
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println(arrayList.isEmpty());
    }
}
