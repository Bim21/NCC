package com.ncc.collection.Map;

import java.util.ArrayList;
import java.util.HashMap;

public class hashMapExample {
    public static void main(String[] args) {
//        HashMap<String, ArrayList<String>> booksByAuthor = new HashMap<>();
//        //Thêm sách vào danh sách sách của tác giả
//        String author = "Rowling";
//        ArrayList<String> books = new ArrayList<>();
//        books.add("Harry Potter và hòn đá phù thủy");
//        books.add("Harry Potter và phòng chứa bí mật");
//        books.add("Harry Potter và nhà tù Azkaban");
//        booksByAuthor.putIfAbsent(author, books);
//
//        ArrayList<String> books2 = new ArrayList<>();
//        books2.add("Harry Potter và phòng chứa bí mật");
//        books2.add("Harry Potter và nhà tù Azkaban");
//        booksByAuthor.putIfAbsent(author, books2);
//
//        ArrayList<String> RowlingBooks = booksByAuthor.get("Rowling");
//        System.out.println(RowlingBooks);
////        System.out.println(books);
//        //
////        author = "Stephen King";
////        books = new ArrayList<>();
////        books.add("The Shining");
////        books.add("Carrie");
////        books.add("IT");
////        booksByAuthor.put(author, books);
////
////        ArrayList<String> RowlingBooks = booksByAuthor.get("Rowling");
////        System.out.println(RowlingBooks);
        HashMap<String,String> h2 = new HashMap<>();
        h2.put("a","ngay thu 2");
        System.out.println(h2);
        h2.put("a","ngay thu 3");
        System.out.println(h2);
    }
}
