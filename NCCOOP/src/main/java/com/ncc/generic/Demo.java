package com.ncc.generic;

public class Demo {
    public static void main(String[] args) {
        Book b = new Book("Study", "hoc");
        String english = b.getKey();
        String vietnamese = b.getValue();
        System.out.println(english + ": " + vietnamese);
    }
}
