package Methodoverloading;

class MethodOverloadingDifferentType {

    void display(int a) {
        System.out.println("Method with int parameter: " + a);
    }

    void display(String message) {
        System.out.println("Method with String parameter: " + message);
    }

    public static void main(String[] args) {
        MethodOverloadingDifferentType obj = new MethodOverloadingDifferentType();
        obj.display(10);         
        obj.display("Hello");    
    }
}
