package com.ncc.innerClass;

public class StaticInnerClass {
    private static int x = 10;

    public static class InnerClass {
        public void display() {
            System.out.println("Value of x is " + x);
        }
    }
}
