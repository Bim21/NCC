package com.ncc.overloading;

public class Sum {
    // thay doi so luong tham so
    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    //Thay doi kieu tra ve cua tham so
    public void sum(int a, double b){
        System.out.println(a+b);
    }

    //Tu dong ep kieu trong nap chong
    public void sum(float a, float b){
        System.out.println("First method will be call");
    }
    public void sum(long a, long b){
        System.out.println("Second method will be call");
    }
}
