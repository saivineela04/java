package JavaIO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class WriteUsingBufferedWriter {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("BufferedWriter Example.");
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}