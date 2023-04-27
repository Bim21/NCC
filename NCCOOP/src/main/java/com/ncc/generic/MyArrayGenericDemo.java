package com.ncc.generic;

public class MyArrayGenericDemo {
    public static void main(String[] args) {
        String[] names = new String[] {"Dat","Khoa","Bao"};

        // truyền arr name vào trong MyArrayGeneric để gắn mảng vào trong nó
        MyArrayGeneric<String> myArrayGeneric = new MyArrayGeneric<String>(names);

        System.out.println("First name: " + myArrayGeneric.getFirstElement());
        System.out.println("Last name: " + myArrayGeneric.getLastElement());
    }
}
