package ThisandSuper;
class Parent {
    int num = 100;
}

class ParentSuperExample extends Parent {
    int num = 50;

    void display() {
        System.out.println("Child class num: " + this.num);
        System.out.println("Parent class num using super: " + super.num);
    }

    public static void main(String[] args) {
        new ParentSuperExample().display();
    }
}