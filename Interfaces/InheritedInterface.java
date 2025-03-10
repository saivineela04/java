package Interfaces;
interface ParentInterface {
    void methodInParent();
}

interface ChildInterface extends ParentInterface {
    void methodInChild();
}

class ImplementingClass implements ChildInterface {
    public void methodInParent() {
        System.out.println("Method in Parent");
    }

    public void methodInChild() {
        System.out.println("Method in Child");
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.methodInParent();
        obj.methodInChild();
    }
}

