package com.ncc;

import com.ncc.abstractclass.Ford;
import com.ncc.entity.Student;
import com.ncc.overloading.Sum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student = new Student("Nguyen Van A", 21);
        Ford ford = new Ford();

        System.out.println(ford.getWheelAmount());
        ford.di();
        ford.napNhienLieu();

        Sum s = new Sum();
        s.sum(10,20,30);
        s.sum(10,1.5);

    }
}