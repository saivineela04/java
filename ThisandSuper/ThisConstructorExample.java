package ThisandSuper;
class ThisConstructorExample {
    ThisConstructorExample() {
        this(42);
        System.out.println("Default Constructor");
    }

    ThisConstructorExample(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new ThisConstructorExample();
    }
}
