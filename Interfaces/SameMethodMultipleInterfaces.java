package Interfaces;
interface FirstInterface {
    void sameMethod();
}

interface SecondInterface {
    void sameMethod();
}

class ImplementingClass implements FirstInterface, SecondInterface {
    public void sameMethod() {
        System.out.println("Same Method Implemented");
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.sameMethod();
    }
}
