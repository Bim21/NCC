package com.ncc.collection.Map;

import com.ncc.entity.Student;

import java.util.HashSet;

public class hashSetExample {
    public static void main(String[] args) {
        Class math = new Class("Math");
        Class physics = new Class("Physics");

        Student chien = new Student("chien", 22);
        Student bao = new Student ("bao", 23);
        Student nam = new Student("nam", 18);

        math.addStudent(chien);
        math.addStudent(new Student("chien", 22));
        math.addStudent(bao);
        physics.addStudent(chien);
        physics.addStudent(nam);

        System.out.println("Danh sach hoc sinh cua lop Toan: ");
        for (Student student : math.getStudents()){
            System.out.println(student.getName() + "(Age: " + student.getAge() + ")");

        }
        System.out.println(math.getStudents().size());
        System.out.println("Danh sach hoc sinh cua lop Vat Ly: ");
        for (Student student : physics.getStudents()){
            System.out.println(student.getName() + "(Age: " + student.getAge() + ")");
        }
        for (Student student : math.getStudents()){
            int hashCode = System.identityHashCode(student);
            System.out.println("HashCode of" + student.getName()+ " is "+hashCode);
        }
    }

}
// Trong hashSet, hashCode được sử dụng để phân loại các phần tử
//vào các ô chứa khác nhau.
//Mỗi phần tử sẽ có một giá trị hashCode riêng biệt, dựa trên thuật toán tính toán hashCode
//được định nghĩa trong class đó.
// identityHashCode dùng để kiểm tra mã băm của các đối tượng Student