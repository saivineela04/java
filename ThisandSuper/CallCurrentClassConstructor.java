package ThisandSuper;
class CallCurrentClassConstructor {
    CallCurrentClassConstructor() {
        this(100); // Calls the argument constructor
        System.out.println("Default Constructor");
    }

    CallCurrentClassConstructor(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new CallCurrentClassConstructor();
    }
}