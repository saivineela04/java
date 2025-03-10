package Interfaces;
interface ExampleInterface {
    void implementedMethod();
}

class ImplementingClass implements ExampleInterface {
    public void implementedMethod() {
        System.out.println("Implemented method in class.");
    }

    public static void main(String[] args) {
        ExampleInterface obj = new ImplementingClass();
        obj.implementedMethod();
    }
}
