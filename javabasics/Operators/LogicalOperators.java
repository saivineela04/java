package javabasics.Operators;
public class LogicalOperators {

    public static void performLogicalOperations(boolean a, boolean b) {
        System.out.println("Logical AND: " + (a && b)); // AND
        System.out.println("Logical OR: " + (a || b));  // OR
        System.out.println("Logical NOT a: " + !a);     // NOT for a
        System.out.println("Logical NOT b: " + !b);     // NOT for b
    }

    public static void main(String[] args) {
        boolean x = true, y = false;
        performLogicalOperations(x, y);
    }
}