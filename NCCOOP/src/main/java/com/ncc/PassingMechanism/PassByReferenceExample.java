package com.ncc.PassingMechanism;

import com.ncc.entity.Person;

public class PassByReferenceExample {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println("Before change: " + person.getName() + " - " + person.getAge());
        changePerson(person);
        System.out.println("After change: " + person.getName() + " - " + person.getAge());

    }

    public static void changePerson(Person p) {
//        p.setName("Mary");
//        p.setAge(25);
        System.out.println(p);
        p = new Person("A", 20);
        System.out.println(p);
    }
}