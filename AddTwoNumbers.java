import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter your second number: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        input.close();
    }
}
