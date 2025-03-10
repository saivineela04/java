package Exception;

public class MethodThrowingException {
    public static void throwException() throws ArithmeticException {
        throw new ArithmeticException("This is a custom ArithmeticException.");
    }

    public static void main(String[] args) {
        throwException(); // This will throw the ArithmeticException without a try-catch block
    }
}
