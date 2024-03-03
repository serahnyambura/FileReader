import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// FileReader class to read the file and handle exceptions
class MyFileReader {
    // Method to read the file and handle exceptions
    public static void readFile(String filePath) throws IOException, EmptyFileException {
        // Create a File object representing the specified file path
        File file = new File(filePath);

        // Check if the file exists and is readable
        if (!file.exists()) {
            // Throw IOException if the file does not exist or is not readable
            throw new IOException("File does not exist!");
        } else if (!file.canRead()) {
            throw new IOException("File is not readable!");
        }

        // Read the file using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // Check if the file is empty
            if (reader.readLine() == null) {
                // Throw EmptyFileException if the file is empty
                throw new EmptyFileException("File is empty");
            }

            // Process the file content
            String line;
            while ((line = reader.readLine()) != null) {
                // Print each line to the console
                System.out.println(line);
            }
        }
    }
}