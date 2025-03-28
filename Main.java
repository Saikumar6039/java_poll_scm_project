public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Application...");

        // Simulating API call
        ApiService apiService = new ApiService();
        String apiResponse = apiService.fetchData();
        System.out.println("API Response: " + apiResponse);

        // File Processing
        FileProcessor fileProcessor = new FileProcessor("data/input.txt");
        fileProcessor.processFile();

        System.out.println("Application Finished.");
    }
}

