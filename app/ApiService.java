import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ApiService {

    public String fetchData() {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("HTTP Error: " + conn.getResponseCode());
            }

            Scanner sc = new Scanner(conn.getInputStream());
            StringBuilder response = new StringBuilder();
            while (sc.hasNext()) {
                response.append(sc.nextLine());
            }
            sc.close();
            return response.toString();
        } catch (Exception e) {
            return "Failed to fetch API data: " + e.getMessage();
        }
    }
}

