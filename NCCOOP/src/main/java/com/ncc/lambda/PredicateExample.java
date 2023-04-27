package com.ncc.lambda;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicateString = s -> {
            // Predicate String
            return s.equals("predicate example");
        };
        System.out.println(predicateString.test("predicate example"));
        System.out.println(predicateString.test("predicateString"));

        //Predicate integer
        Predicate<Integer> predicateInt = i -> {
            return i > 0;
        };
        System.out.println(predicateInt.test(1)); //true
        System.out.println(predicateInt.test(-1)); //false
    }
}
//Predicate<T> là một functional Interface
//Predicate<T> sẽ trả về giá trị true/false của một tham số kiểu T mà bạn đưa vào có thỏa với điều kiện của
//Predicate đó hay không, cụ thể là điều kiện được viết trong phương thức test().
// test():
//      - trả về true nếu đối số đầu vào khớp với biêến predicate