package com.ncc.innerClass;

public class LocalInnerClass {
    public void display() {
        final int x = 10;
        class InnerClass {
            public void display() {
                System.out.println("Value of x is " + x);
            }
        }
        InnerClass inner = new InnerClass();
        inner.display();
    }
}
