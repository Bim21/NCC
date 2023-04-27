package com.ncc.entity;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        System.out.println("goi Constructor mac dinh");
    }

    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        System.out.println("Constructor Person...");
    }

}
