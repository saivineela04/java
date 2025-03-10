package Interfaces;
interface FirstInterface {
    void methodOne();
}

interface SecondInterface {
    void methodTwo();
}

class ImplementingClass implements FirstInterface, SecondInterface {
    public void methodOne() {
        System.out.println("Method One Implemented");
    }

    public void methodTwo() {
        System.out.println("Method Two Implemented");
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.methodOne();
        obj.methodTwo();
    }
}
