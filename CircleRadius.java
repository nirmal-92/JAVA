import java.io.*;
import java.util.*;
public class CircleRadius{
	public static void main(String[] args){
		double area;
		System.out.println("Enter the Radius:");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		if(radius<0){
			System.out.println("Incorrect input");
		}
		else{
			area = radius * radius * 3.14159;
			System.out.println("Area is "+area);
		}
	}
}