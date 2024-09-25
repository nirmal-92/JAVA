import java.util.Scanner;
class Add{
	int c;
	void addition(int x, int y)
	{
		c = x + y;
	}
}
class Sum
{
	public static void main(String[] args){
		int a,b;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the first integer:");
			a = scanner.nextInt();
			System.out.println("Enter the second integer:");
			b = scanner.nextInt();
		}
		Add r = new Add();
		r.addition(a,b);
		System.out.println("Addition of two numbers is:" +r.c);
	}
}