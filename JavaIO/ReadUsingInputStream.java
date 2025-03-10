package JavaIO;
import java.io.*;

class ReadUsingInputStream {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\DELL\\OneDrive\\Desktop\\Java\\input.txt";

        File file = new File(filePath);
        if (!file.exists()) {
            try (FileWriter fw = new FileWriter(file)) {
                fw.write("This is a sample text file.");  
                System.out.println("File created: " + filePath);
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
            }
        }

        // Now read the file
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
