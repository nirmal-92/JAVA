import java.text.*;
import java.util.Calendar;

public class SimpleDateFormat_Demo {
	public static void main(String[] args)throws InterruptedException {

		SimpleDateFormat SDFormat = new SimpleDateFormat("MM/ dd/ yy");
		try{
			Calendar cal = Calendar.getInstance();	
			String dt = "10/ 27/ 16";
			System.out.println("The  unparsed" + " string is: " +dt);
			cal.setTime(SDFormat.parse(dt));
			System.out.println("Timeparsed : " +cal.getTime());
		}
		catch(ParseException except) {
			except.printStackTrace();
		}
	}
}
