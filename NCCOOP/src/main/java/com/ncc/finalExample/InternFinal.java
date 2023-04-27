package com.ncc.finalExample;

public class InternFinal {
    public static void main(String[] args) {
        final Intern intern = new Intern("Chien", 21);
        intern.setName("Bảo");
        System.out.println("before change: "+intern.getName()+intern.getAge());

//        intern = new Intern("Bảo", 22); // báo lỗi: Cannot assign a value to final variable 'intern'
        System.out.println("after change: "+intern.getName()+intern.getAge());
    }

}
