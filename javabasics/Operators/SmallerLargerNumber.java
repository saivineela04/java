package javabasics.Operators;

public class SmallerLargerNumber {
    public static void main(String[] args) {
        int num1 = 5, num2 = 10;
        if (num1 < num2) {
            System.out.println("Smaller: " + num1);
            System.out.println("Larger: " + num2);
        } else {
            System.out.println("Smaller: " + num2);
            System.out.println("Larger: " + num1);
        }
    }
}
