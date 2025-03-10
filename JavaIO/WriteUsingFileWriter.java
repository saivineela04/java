package JavaIO;
import java.io.FileWriter;
import java.io.IOException;

class WriteUsingFileWriter {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write("FileWriter Example.");
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
