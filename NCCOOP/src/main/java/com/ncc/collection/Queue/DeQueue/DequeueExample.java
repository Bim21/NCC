package com.ncc.collection.Queue.DeQueue;

import java.util.ArrayDeque;
import java.util.Deque;



public class DequeueExample {
    public static int findMax(int[] arr, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1) {
                max = Math.max(max, arr[deque.peekFirst()]);
                System.out.println(max);
            }
        }
        return max;

    }
}