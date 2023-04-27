package com.ncc.collection.List;

public class Program {
    public static void main(String[] args) {
        ArrayListAndLinkList arrayListAndLinkList = new ArrayListAndLinkList();
        arrayListAndLinkList.addElement(1);
        arrayListAndLinkList.addElement(2);
        arrayListAndLinkList.addElement(3);
        arrayListAndLinkList.addElement(4);

        arrayListAndLinkList.printArrayList();
        arrayListAndLinkList.printLinkedList();
    }
}
