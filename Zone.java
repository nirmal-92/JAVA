import java.time.*;
public class Zone {
    public static void main(String[] args) {
        //create a clock
        ZoneId zid = ZoneId.of("Asia/Kolkata");
        //create an LocalDate object using now(zoneId)
        LocalDate It = LocalDate.now(zid);
        //print result
        System.out.println("LocalDate :"+ It);
    }
} 
    

