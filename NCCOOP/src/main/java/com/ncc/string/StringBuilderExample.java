package com.ncc.string;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");
        System.out.println(sb);

        sb.insert(5, " beautiful");
        System.out.println(sb);

        sb.delete(11,20);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb.toString()); // Output: "dlrow olleH"

        sb.replace(6, 11, "wonderful");
        System.out.println(sb.toString()); // Output: "dlrow wonderful"
    }
}
