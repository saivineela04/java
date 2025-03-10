package Methodoverloading;

class MethodOverloadingSameParamsDifferentType {
    void display(int a) {
        System.out.println("Method with int parameter: " + a);
    }

    void display(double a) {
        System.out.println("Method with double parameter: " + a);
    }

    public static void main(String[] args) {
        MethodOverloadingSameParamsDifferentType obj = new MethodOverloadingSameParamsDifferentType();
        obj.display(10); 
        obj.display(10.5);
    }
}
