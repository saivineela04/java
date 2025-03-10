package ThisandSuper;

class ThisArgumentConstructor {
    int a, b;

    ThisArgumentConstructor() {
        this(10, 20);  
        System.out.println("Default Constructor");
    }

    ThisArgumentConstructor(int x, int y) {
        this.a = x;
        this.b = y;
        System.out.println("Parameterized Constructor: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        new ThisArgumentConstructor();
    }
}