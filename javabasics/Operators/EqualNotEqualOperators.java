package javabasics.Operators;
public class EqualNotEqualOperators {
    
    public static void checkEquality(int a, int b) {
        if (a == b) {
            System.out.println(a + " is equal to " + b);
        } else {
            System.out.println(a + " is not equal to " + b);
        }
    }

    public static void main(String[] args) {
        int x = 10, y = 20;
        checkEquality(x, y);
    }
}

