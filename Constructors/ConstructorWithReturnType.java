package Constructors;

class ConstructorWithReturnType {

    ConstructorWithReturnType() {
        System.out.println("Default Constructor");
    }

    ConstructorWithReturnType(String msg) {
        System.out.println("Parameterized Constructor: " + msg);
    }

    int getIntValue() {
        System.out.println("Method returning int");
        return 10;
    }

    String getStringValue(String msg) {
        System.out.println("Method returning String");
        return msg;
    }

    public static void main(String[] args) {
      
        ConstructorWithReturnType obj1 = new ConstructorWithReturnType();
       
        int result = obj1.getIntValue();
        String text = obj1.getStringValue("Hello World");

        System.out.println("Result: " + result);
        System.out.println("Text: " + text);
    }
}