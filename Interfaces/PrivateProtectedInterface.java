package Interfaces;
interface PrivateProtectedInterface {
    protected int field = 20;
    void printValue();
}

class ImplementingClass implements PrivateProtectedInterface {
    public void printValue() {
        System.out.println("Field value: " + field);
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.printValue();
    }
}
