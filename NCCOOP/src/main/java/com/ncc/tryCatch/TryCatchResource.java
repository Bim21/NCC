package com.ncc.tryCatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchResource {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {

            System.out.println("Error reading file: " + e.getMessage());
        }
        ;
    }
}
// try catch resource được sử dụng để đóng các tài nguyên sau khi đã hoàn tất
// xử lý, giúp đảm bảo việc giải phóng tài nguyên một cách đúng đắn và tránh xảy ra
// tránh lỗi liên quan đến tài nguyên
//        try(resource) {
//            //Code xử lý tài nguyên
//        } catch(Exception e) {
//            // Code xử lý ngoại lệ
//                }
// 'resource' là đối tượng tài nguyên cần được giải phóng, như một đối tượng
// FileInputStream, Scanner, Connection, Statement, ResultSet,v...v...


