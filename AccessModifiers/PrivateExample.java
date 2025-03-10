package AccessModifiers;
class PrivateExample {
    private String message = "This is a private field!";

    private void displayMessage() {
        System.out.println("Private Method Called: " + message);
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        System.out.println("Accessing Private Field: " + obj.message);
        obj.displayMessage();
    }
}

class SubClass extends PrivateExample {
    void tryAccessPrivate() {
        System.out.println("Cannot access private fields or methods from subclass.");
    }
}