import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class summa {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("List of all Zone IDs:");
        for (String zoneId : zoneIds) {
            System.out.println(zoneId);
        }

        LocalDate zone = LocalDate.now();
        System.out.println(zone);

        ZoneId obj = ZoneId.of("Asia/Amman");
        System.out.println(obj);

        ZonedDateTime obj1 = ZonedDateTime.now(obj);
        System.out.println(obj1);
    }
}