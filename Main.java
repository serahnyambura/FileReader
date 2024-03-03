import java.io.IOException;

// Main class to demonstrate the usage of MyFileReader
public class Main {
    // Main method where the program execution starts
    public static void main(String[] args) {
        // Replace "your_file_path.txt" with the actual file path you want to read
        String filePath = "your_file_path.txt";

        // Try to read the file and handle exceptions
        try {
            // Read the file using MyFileReader
            MyFileReader.readFile(filePath);
            System.out.println("File successfully read.");
        } catch (IOException e) {
            // Handle IOException by printing an error message
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (EmptyFileException e) {
            // Handle EmptyFileException by printing an error message
            System.err.println("Error: " + e.getMessage());
        }
    }
}