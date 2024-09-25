import java.util.*;
public class UnBoxingTest{
	public static void main(String args[]){
		Integer obj = new Integer(10);
		int num = obj.intValue();
		System.out.println(num + " " + obj);
	}
}
