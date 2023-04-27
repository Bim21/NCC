package com.ncc.collection.List;

import java.util.Stack;

//Stack: đảo ngc chuỗi
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello world!";
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0;i< str.length(); i++){
            stack.push(str.charAt(i));
        }
        String reversedStr = "";
        while (!stack.empty()) {
            reversedStr += stack.pop();
        }
        System.out.println("Reversed string: " + reversedStr);
    }
}
