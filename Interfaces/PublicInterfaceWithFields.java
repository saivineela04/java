package Interfaces;
interface PublicInterfaceWithFields {
    int field = 10;
    void printValue();
}

class ImplementingClass implements PublicInterfaceWithFields {
    public void printValue() {
        System.out.println("Field value: " + field);
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.printValue();
    }
}
