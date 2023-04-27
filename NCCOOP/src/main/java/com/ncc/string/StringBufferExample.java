package com.ncc.string;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Thêm chuỗi vào cuối của StringBuffer
        sb.append(" World");
        System.out.println(sb); // Hello World

        // Thêm chuỗi vào vị trí chỉ định
        sb.insert(5, ", ");
        System.out.println(sb); // Hello, World

        // Xóa ký tự từ vị trí 5 đến 7
        sb.delete(5, 7);
        System.out.println(sb); // Hello World

        // Đảo ngược chuỗi
        sb.reverse();
        System.out.println(sb); // dlroW olleH

        // Lấy ký tự tại vị trí chỉ định
        char ch = sb.charAt(6);
        System.out.println(ch); // o

        // Đặt ký tự mới vào vị trí chỉ định
        sb.setCharAt(0, 'h');
        System.out.println(sb); // hlroW olleH

        // Lấy chuỗi con từ vị trí 6 đến 10
        String sub = sb.substring(6, 10);
        System.out.println(sub); // olle

        // Lấy độ dài của StringBuffer
        int length = sb.length();
        System.out.println(length); // 12
    }
}
