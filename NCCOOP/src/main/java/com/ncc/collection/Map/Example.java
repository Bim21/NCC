package com.ncc.collection.Map;

import com.ncc.entity.Student;
import com.ncc.finalExample.Intern;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        HashMap<Integer,String> Intern1 = new HashMap<>();
        Intern intern = new Intern("vinh", 2);
        Intern1.put(1, intern.getName());
        System.out.println(Intern1);
        intern.setName("Khoa");
        System.out.println(intern.getName());
        System.out.println(Intern1.get(1));
    }
}
