package Constructors;
class MultipleConstructorCalls {
    MultipleConstructorCalls() {
        System.out.println("Constructor Called");
    }

    void callConstructor() {

        new MultipleConstructorCalls();
    }

    public static void main(String[] args) {
        MultipleConstructorCalls obj = new MultipleConstructorCalls();
        obj.callConstructor();  
        obj.callConstructor();
    }
}
