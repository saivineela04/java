package JavaIO;
import java.io.FileOutputStream;
import java.io.IOException;

class WriteUsingOutputStream {
    public static void main(String[] args) {
        String text = "Hello, this is a test.";

        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(text.getBytes());
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
