package Interfaces;
interface SingleMethodInterface {
    void implementedMethod();
}

class ImplementingClass implements SingleMethodInterface {
    public void implementedMethod() {
        System.out.println("Implemented method in class.");
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.implementedMethod();
    }
}
