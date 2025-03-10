package JavaIO;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class WriteUsingBufferedOutputStream {
    public static void main(String[] args) {
        String text = "Buffered OutputStream Example.";

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {
            bos.write(text.getBytes());
            bos.flush();
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
