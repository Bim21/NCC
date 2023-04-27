package com.ncc.entity;

import java.util.Objects;

public class Student extends Person{
    private String jazz;
    private float fee;


    public Student(String name, int age) {
        super(name, age);
        System.out.println("Constructor Student...");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return  false;
        }
        Student student = (Student) obj;
        return getAge() == student.getAge() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
