package javabasics.Operators;

public class ArithmeticOperators {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 5));
        System.out.println(subtract(20, 50));
        System.out.println(multiply(10, 500));
        System.out.println(divide(10, 50));
    }
}

