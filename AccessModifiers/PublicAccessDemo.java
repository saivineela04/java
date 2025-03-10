package AccessModifiers;

class PublicExample {
    public String message = "This is a public field!";

    public void displayMessage() {
        System.out.println("Public Method Called: " + message);
    }
}

public class PublicAccessDemo {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        System.out.println("Accessing Public Field: " + obj.message);
        obj.displayMessage();
    }
}