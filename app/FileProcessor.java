import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

    private String filePath;

    public FileProcessor(String filePath) {
        this.filePath = filePath;
    }

    public void processFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Processing file: " + filePath);
            while ((line = reader.readLine()) != null) {
                System.out.println("Read Line: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

