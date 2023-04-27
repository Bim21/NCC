package com.ncc.collection.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkList {
    private ArrayList<Integer> arrayList;
    private LinkedList<String> linkedList;

    public ArrayListAndLinkList() {
        arrayList = new ArrayList<Integer>();
        linkedList = new LinkedList<String>();

    }

    public void addElement(Integer element) {
        arrayList.add(element);
        linkedList.add("Element: " + element);
    }

    public void removeElement(Integer element) {
        arrayList.remove(element);
        linkedList.remove("Element: " + element);
    }

    public void printArrayList() {
        System.out.println("Printing ArrayList...");
        for (Integer element : arrayList) {
            System.out.println(element);
        }
    }

    public void printLinkedList() {
        System.out.println("Printing LinkedList...");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
