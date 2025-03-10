package Methodoverloading;

class MethodOverloadingSameType {
  
    void display(int a) {
        System.out.println("Method with one parameter: " + a);
    }

  void display(int a, int b) {
        System.out.println("Method with two parameters: " + a + " and " + b);
    }

    public static void main(String[] args) {
        MethodOverloadingSameType obj = new MethodOverloadingSameType();
        obj.display(10);       
        obj.display(10, 20);  
    }
}
