package com.ncc.string;

public class StringExample {
    public static void main(String[] args) {
        //Kieu nguyen thuy
        String str1 = "Hello World";
        String str2 = "hello WORLD";

        // Khai bao kieu doi tuong
        String str3 = new String("Hello World!");

        int length = str1.length();
        System.out.println("Độ dài của chuỗi: " + length);

        char firstChar = str1.charAt(1);
        System.out.println("kí tự chỉ định trong chuỗi: " + firstChar);

        String substring = str1.substring(1,9);
        System.out.println(substring);

        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);

        boolean isEqual2 =str1.equalsIgnoreCase(str2);
        System.out.println(isEqual2);


    }



}
