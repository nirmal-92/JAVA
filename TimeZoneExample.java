import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneExample {
    public static void main(String[] args) {
        // Define the time zones for different locations
        ZoneId canadaZone = ZoneId.of("America/Toronto"); // Canada (Eastern Time)
        ZoneId alaskaZone = ZoneId.of("America/Anchorage"); // Alaska
        ZoneId indiaZone = ZoneId.of("Asia/Kolkata"); // India

        // Get the current date and time in the default time zone (usually the system's time zone)
        ZonedDateTime defaultZone = ZonedDateTime.now();
        printDateTime("Default Time Zone", defaultZone);

        // Get the current date and time in Canada (Eastern Time)
        ZonedDateTime canadaTime = ZonedDateTime.now(canadaZone);
        printDateTime("Canada (Eastern Time)", canadaTime);

        // Get the current date and time in Alaska
        ZonedDateTime alaskaTime = ZonedDateTime.now(alaskaZone);
        printDateTime("Alaska", alaskaTime);

        // Get the current date and time in India
        ZonedDateTime indiaTime = ZonedDateTime.now(indiaZone);
        printDateTime("India", indiaTime);
    }

    // Helper method to print date and time
    private static void printDateTime(String location, ZonedDateTime zonedDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedDateTime = zonedDateTime.format(formatter);
        System.out.println(location + ": " + formattedDateTime);
    }
}