package Exception;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
        } catch (Exception e) {
            System.out.println("Inside catch block");
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
