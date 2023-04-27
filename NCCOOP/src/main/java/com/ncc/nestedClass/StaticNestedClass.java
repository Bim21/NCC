package com.ncc.nestedClass;

public class StaticNestedClass {
    private static int x = 10;

    static class NestedClass {
        void printX() {
            System.out.println("x = " + x);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.NestedClass nested = new StaticNestedClass.NestedClass();
        nested.printX();
    }
}
// Nested class là một class được khai báo trong một class khác
// Trong java, có hai loại nested class: static nested class và non-static nested class
//Static nested class là một class được khai báo như một thành viên tĩnh (static) của lớp bao bọc (outer class).
// Nó có thể được truy cập mà không cần tạo một instance của lớp bao bọc.
