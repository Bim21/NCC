package com.ncc.staticExample;

public class StaticVariable {
    static int count =0;

    StaticVariable(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticVariable s1 = new StaticVariable();
        StaticVariable s2 = new StaticVariable();
        StaticVariable s3 = new StaticVariable();
    }
}
