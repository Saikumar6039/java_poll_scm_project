import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerService {

    public static void log(String message) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()) + " - " + message);
    }
}

