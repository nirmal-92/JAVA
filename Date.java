import java.time.LocalDate;
import java.time.LocalTime;//import the LocalDate class
public class Date {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();//Create a date object
        LocalTime myObj1 = LocalTime.now();
        System.out.println(myObj);
        System.out.println(myObj1);//Display the current date
    }
}
