package com.ncc.tryCatch;

public class ThrowExceptionExample {
    public static void main(String[] args) {
        try{
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws Exception{
        if(age < 18){
            throw new Exception("Tuổi phải lớn hơn hoặc bằng 18");
        }
    }
}
// có mấy loại exception?
// try catch lồng nhau