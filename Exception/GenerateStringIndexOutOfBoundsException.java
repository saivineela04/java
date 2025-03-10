package Exception;

public class GenerateStringIndexOutOfBoundsException {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.charAt(10)); // This will generate StringIndexOutOfBoundsException
    }
}
