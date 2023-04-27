package com.ncc.nestedClass;

public class NonStaticNestedClass {
    private int x = 10;

    class InnerClass{
        void printX(){
            System.out.println("x = " +x);
        }
    }

    public static void main(String[] args) {
        NonStaticNestedClass non = new NonStaticNestedClass();
        NonStaticNestedClass.InnerClass inner = non.new InnerClass();
        inner.printX();
    }
}
