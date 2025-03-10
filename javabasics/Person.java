package javabasics;
public class Person {
    // Instance variable
    String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Method with signature
    public void printName() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Create an object of Person class
        Person person = new Person("Sai Vineela");

        // Calling the method
        person.printName();
    }
}
