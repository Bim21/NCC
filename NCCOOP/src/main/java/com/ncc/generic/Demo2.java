package com.ncc.generic;

public class Demo2 {
    public static void main(String[] args) {
        Book2<String,String> b2 = new Book2<>("Study", "hoc");
        String eng = b2.getKey();
        String vie = b2.getValue();
        System.out.println(eng + ": "+vie);
    }
}
