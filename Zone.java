import java.time.LocalDate;
import java.time.ZoneId;

public class Zone {
    public static void main(String[] args) {
        // Create a clock
        ZoneId zid = ZoneId.of("Asia/Kolkata");

        // Get the current date for the specified time zone
        LocalDate currentDate = LocalDate.now(zid);

        // Print the result
        System.out.println("LocalDate: " + currentDate);
    }
}
   

