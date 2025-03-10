package AccessModifiers;

class ProtectedExample {
    protected String message = "This is a protected field!";

    protected void displayMessage() {
        System.out.println("Protected Method Called: " + message);
    }
}

// Subclass in the same file
class SubClassProtected extends ProtectedExample {
    void accessProtected() {
        System.out.println("Accessing Protected Field from Subclass: " + message);
        displayMessage();
    }
}

// Non-subclass in the same file
class NonSubClass {
    void tryAccessProtected() {
        @SuppressWarnings("unused")
        ProtectedExample obj = new ProtectedExample();
        System.out.println("Cannot access protected members from a non-subclass.");
    }
}

// Main class to test everything
public class ProtectedAccessDemo {
    public static void main(String[] args) {
        System.out.println("---- Accessing from Same Class ----");
        ProtectedExample obj1 = new ProtectedExample();
        System.out.println("Accessing Protected Field: " + obj1.message);
        obj1.displayMessage();

        System.out.println("\n---- Accessing from SubClass ----");
        SubClassProtected obj2 = new SubClassProtected();
        obj2.accessProtected();

        System.out.println("\n---- Trying to Access from Non-Subclass ----");
        NonSubClass obj3 = new NonSubClass();
        obj3.tryAccessProtected();
    }
}
