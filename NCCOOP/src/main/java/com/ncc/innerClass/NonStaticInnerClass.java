package com.ncc.innerClass;

public class NonStaticInnerClass {
    private int x = 10;

    public class InnerClass {
        public void display() {
            System.out.println("Value of x is " + x);
        }
    }
}
