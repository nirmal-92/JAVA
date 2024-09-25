import java.util.Scanner;

public class PrintFirstNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("The first " + n + " natural numbers are:");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
