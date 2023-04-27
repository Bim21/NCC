package com.ncc.collection.List;

import java.util.LinkedList;

public class LinkListExample {
    public static void main(String[] args) {

        //Tạo đối tượng LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();

        //Thêm phần tử vào đầu danh sách
        linkedList.addFirst("Apple");
        linkedList.addFirst("Banana");
        linkedList.addFirst("melon");
        //Thêm phần tử vào cuối danh sách
        linkedList.addLast("Cherry");
        //Thêm phần tử vào vị trí chỉ định
        linkedList.add(3, "Potato");
        //Hiển thị danh sách
        System.out.println("LinkedList: " + linkedList);
        //Xóa phần tử đầu tiên
        linkedList.removeFirst();
        //Xóa phần tử cuối cùng
        linkedList.removeLast();
        System.out.println("LinkedList after removing first element: " + linkedList);
        //trả về phần tử ở vị trí chỉ định trong danh sách
        System.out.println(linkedList.get(1));
        System.out.println("Lay phan tu dau tien: "+linkedList.getFirst());
        System.out.println("Lay phan tu cuoi cung: "+linkedList.getLast());
        linkedList.remove();
        System.out.println(linkedList);
        linkedList.remove(0);
        System.out.println(linkedList);
    }
}
