package com.ncc.staticExample;

public class StaticMethod {
    int rollno;
    String name;
    static String company = "NCC";

    static void change(){
        company = "NCC-HN2";
    }
    public StaticMethod(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(rollno + " - " + name + " - " + company);
    }

    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(1, "Chien");
        StaticMethod s2 = new StaticMethod(2, "Duong");
        s1.display();
        s2.display();
    }
}
