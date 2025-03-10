package javabasics.Operators;
public class IncrementDecrementOperators {
    public static void increment(int a) {
        System.out.println(a++);
        System.out.println(++a);
    }

    public static void decrement(int a) {
        System.out.println(a--);
        System.out.println(--a);
    }

    public static void main(String[] args) {
        increment(4);
        decrement(4);
    }
}
