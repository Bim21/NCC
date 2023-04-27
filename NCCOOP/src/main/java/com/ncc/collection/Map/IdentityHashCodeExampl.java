package com.ncc.collection.Map;

public class IdentityHashCodeExampl {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        int hash1 = System.identityHashCode(str1);
        int hash2 = System.identityHashCode(str2);

        System.out.println(hash1); // 1480010240
        System.out.println(hash2); // 81628611

    }
}
