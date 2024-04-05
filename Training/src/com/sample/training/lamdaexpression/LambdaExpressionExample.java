package com.sample.training.lamdaexpression;

public class LambdaExpressionExample {
    interface MathOperation {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
        // Using lambda expression
        MathOperation addition = (int a, int b) -> a + b;

        int result = addition.operation(10, 5);
        System.out.println("Result of addition: " + result);
    }
}

