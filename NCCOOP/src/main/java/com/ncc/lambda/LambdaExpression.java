package com.ncc.lambda;

@FunctionalInterface
interface Hi{
    public String xinChao();
}
public class LambdaExpression {
    public static void main(String[] args) {
        Hi s = () -> {
            return "Hello Lambda.";
        };
        System.out.println(s.xinChao());
    }
}
