package com.ncc.tryCatch;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[5]);

            try {
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e){
                System.out.println("Lỗi: " +e.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Lỗi: "+e.getMessage());
        }
    }
}
