package com.ncc.collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");
        queue.add("Element 4");

        System.out.println("Queue: " + queue);

        //Lấy ra phần tử đầu tiên của queue và loại bỏ nó khỏi queue
        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        //In ra toàn bộ các phần tử còn lại trong queue
        System.out.println("Queue after removal: " + queue);
    }
}


// Các phương thức trong queue
//        1.enqueue(element): Thêm một phần tử vào cuối của queue.
//
//        2.dequeue(): Lấy ra phần tử đầu tiên của queue và loại bỏ nó khỏi queue.
//
//        3.peek(): Truy cập phần tử đầu tiên của queue mà không loại bỏ nó.
//
//        4.size(): Trả về số lượng phần tử hiện có trong queue.

// Ứng dụng của Queue:
//    1. Hàng đợi tác vụ
//    2. Tính toán phân tán
//    3. Truyền tin
//    4. Hệ Thống xử lý sự kiện:
//    5. Tạo một lịch trình