package com.ncc.springPool;

public class SpringPoolExample {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "he" + "llo";
        String s3 = "he";
        String s4 = s3 + "llo";
        String s5 = "llo";
        String s6 = s3 + s5;

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s6);
        System.out.println(s1.equals(s6));

        String s7 = new String("Hello");
        String s8 = new String("Hello");
        System.out.println(s7==s8);
    }
}
