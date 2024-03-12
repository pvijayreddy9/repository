package com.sample.training;

public class Main {
    
    public static void main() {
        System.out.println("No arguments provided.");
    }
    
    public static void main(String[] args) {
        System.out.println("Arguments provided:");
        for (String arg : args) {
            System.out.println(arg);
        }
        main();
        main(654);
        main(976,"Integer Provided");
    }
    public static void main(int value) {
        System.out.println("Integer argument provided: " + value);
    }

    public static void main(String[] args, int value) {
        System.out.println("Arguments provided with an integer: ");
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("Integer argument provided: " + value);
    }

    public static void main(int value, String arg) {
        System.out.println("Integer argument provided: " + value);
        System.out.println("Argument provided: " + arg);
    }    
    
}

