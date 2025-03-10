package ThisandSuper;
// Save this as ThisAndSuperMethods.java
class ParentMethod {
    void show() {
        System.out.println("Parent show() method");
    }
}

class ThisAndSuperMethods extends ParentMethod {
    void show() {
        super.show(); 
        System.out.println("Child show() method");
    }

    void display() {
        this.show(); 
    }

    public static void main(String[] args) {
        ThisAndSuperMethods obj = new ThisAndSuperMethods();
        obj.display();
    }
}
