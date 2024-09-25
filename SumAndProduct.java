import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        int product = num1 * num2;

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        input.close();
    }
}

