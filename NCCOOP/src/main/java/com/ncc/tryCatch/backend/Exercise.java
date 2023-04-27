package com.ncc.tryCatch.backend;

import com.ncc.tryCatch.entity.Department;

import java.util.Scanner;

//Hãy xử lý exception cho VD trên, khi bị lỗi thì sẽ in ra text "cannot
//        divide 0"
public class Exercise {
    public static float divide(int a, int b) {
        return a / b;
    }

    public void Question01() {
        try {
            float result = divide(7, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("cannot divide 0");
        }
    }

    //    Question 2: tiếp tục Question 1
//    Sau khi thực hiện xong method divide dù có lỗi hay không sẽ in ra text
//            "divide completed!"
    public void Question02() {
        try {
            float result = divide(7, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Cannot divide 0");
        } finally {
            System.out.println("Divide complete!");
        }
    }

    public void Question03() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    //Question 4:Tạo 1 array departments gồm 3 phần tử
//        Sau đó viết 1 method getIndex(int index) để lấy thông tin phần tử thứ
//        index trong array departments. Nếu index vượt quá length lấy ra thì sẽ
//        in ra text "Cannot find department."
    public void Question04() {
        Department d = new Department(1, "Sale");
        Department d1 = new Department(2, "Marketing");
        Department d2 = new Department(3, "Game");
        Department d3 = new Department(4, "Security");
        Department[] arrDe = {d, d1, d2, d3};
        System.out.println("Nhap vao index: ");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(arrDe[scanner.nextInt()]);
        } catch (Exception e) {
            System.err.println("Cannot find department.");
        }

    }
    //    Question 5:
//    Tạo 1 method inputAge() và trả về 1 số int.
//    Trong method hãy cài đặt như sau:
//    B1: Sau đó dùng scanner để nhập vào 1 số
//
//    B2: Check exeption
//    Nếu người dùng nhập vào 1 số thì return về số đó
//    Nếu người dùng không nhập vào 1 số thì sẽ in ra dòng
//    text "wrong inputing! Please input an age as int, input
//    again."
//    Nếu người dùng không nhập vào 1 số < 0 thì sẽ in ra
//    dòng text "Wrong inputing! The age must be greater
//    than 0, please input again."
//    B3: hãy demo trong method main()
//    Gợi ý:
//            - Tại bước 1 & bước 2: Check exception, ta có thể yêu cầu người
//    dùng nhập vào String (scanner.nextLine()),
//            - Sau đó sử dụng casting datatype để convert String to int
//- Nếu convert được thì suy ra người dùng nhập vào 1 số
//    int
//- Nếu không convert được thì suy ra người dùng nhập sai,
//    khi người dùng nhập sai thì sẽ in ra text "wrong
//    inputing! Please input an age as int, input again."
    public int inputAge() throws Exception {
        System.out.println("Nhap tuoi cua ban: ");
        String s;
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        try{
            s = scanner.next();
            age = Integer.parseInt(s);
        }catch (Exception e){
            System.out.println("Wrong input!! please input an age as int, input again");
        }
        if (age<0) {
            throw new Exception("Wrong input!! the age must be greater than 0, please input again");
        }
        return age;
    }
}



