package javabasics;

public class VariableScope {
    static int num = 100;

    public static void main(String[] args) {
        // Local variable with the same name
        int num = 50;

        // Printing local and global variables
        System.out.println("Local variable: " + num); // Refers to local variable
        System.out.println("Global variable: " + VariableScope.num); // Refers to global variable
    }
}
