package com.ncc.lambda;

//and(), or(), negate(), isEqual()

import java.util.function.Predicate;

//    and(): Nó thực hiện logic AND của predicate mà nó được gọi với
//    một biến predicate khác.
//    and(): Nó thực hiện logic OR của predicate mà nó được gọi với
//    một biến predicate khác.
//    negate(): Nó thực hiện phủ định kết quả của biến
public class PredicateExample2 {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> {
            return s.equals("PredicateExp");
        };

        // AND logical operation
        Predicate<String> predicateAnd= predicate.and(s -> s.length() == 12);
        System.out.println(predicateAnd.test("PredicateExp"));
        // OR logical operation
        Predicate<String> predicateOr= predicate.or(s -> s.length() == 14);
        System.out.println(predicateOr.test("PredicateExp22"));
        // NEGATE logical operation
        Predicate<String> predicateNegate = predicate.negate();
        System.out.println(predicateNegate.test("PredicateExp"));


    }
}
