package ThisandSuper;

class ParentClass {
    ParentClass() {
        System.out.println("Parent Constructor");
    }
}

class SuperConstructorExample extends ParentClass {
    SuperConstructorExample() {
        super();  // Calls Parent Constructor
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new SuperConstructorExample();
    }
}
