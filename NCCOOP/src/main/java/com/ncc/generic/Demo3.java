package com.ncc.generic;

public class Demo3 {
    public static void main(String[] args) {
        Book3<String, String, Integer> b3 = new Book3<>("English", "tieng anh", 1);
        String eng = b3.getKey();
        String vie = b3.getValue();
        Integer id = b3.getInfo();
        System.out.println(eng + ": " + vie + "-" + id);
    }
}
