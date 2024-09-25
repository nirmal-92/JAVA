import java.util.Scanner;
public class FindingEvenOdd{
	public static void main(String[] args){
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter an Integer:");
			int number = input.nextInt();
			if (number % 2 == 0){
				System.out.println(+ number + " is an Even Number");
			}
			else{
				System.out.println(+ number + " is an Odd Number");
			}
		}
	}
}