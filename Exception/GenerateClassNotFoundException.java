package Exception;

public class GenerateClassNotFoundException {
    public static void main(String[] args) {
        try {
            Class.forName("com.nonexistent.Class"); // This will generate ClassNotFoundException
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e);
        }
    }
}
