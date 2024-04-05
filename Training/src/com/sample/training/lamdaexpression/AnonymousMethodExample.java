package com.sample.training.lamdaexpression;

public class AnonymousMethodExample {
    interface MathOperation {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
        // Using anonymous method
        MathOperation addition = new MathOperation() {
            public int operation(int a, int b) {
                return a + b;
            }
        };

        int result = addition.operation(10, 5);
        System.out.println("Result of addition: " + result);
    }
}

