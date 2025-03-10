package Exception;

import java.io.IOException;

public class GenerateIOException {
    public static void main(String[] args) {
        try {
            throw new IOException("This is a custom IO exception");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
