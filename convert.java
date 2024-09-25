import java.io.*;
import java.util.Scanner;

public class convert{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n>=-100 && n<=100){
			String s = Integer.toString(n);
			System.out.println("Good Job");
		}
		else{
			System.out.println("Wrong Answer");
		}
		}
}