import java.io.*;
import java.util.Scanner;
class person{
	person(int num1,int num2){
		System.out.println("The sum is " +(num1+num2));
	}
		
}	

public class constsum{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			person s = new person(num1,num2);
		}
	}
}
		