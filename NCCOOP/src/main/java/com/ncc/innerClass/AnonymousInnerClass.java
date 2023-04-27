package com.ncc.innerClass;

public class AnonymousInnerClass {
    public void sayHello() {
        HelloWorld hw = new HelloWorld() {
            public void greet() {
                System.out.println("Hello World!");
            }
        };
        hw.greet();
    }
}
