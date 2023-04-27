package com.ncc.collection.Map;

import com.ncc.entity.Student;

import java.util.HashSet;
import java.util.Objects;

public class Class {
    private String name;
    private HashSet<Student> students;

    public Class(String name) {
        this.name = name;
        students = new HashSet<Student>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }

    public HashSet<Student> getStudents() {
        return students;
    }


}
