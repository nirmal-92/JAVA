import java.util.Scanner;

public class NumberConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 100) {
            System.out.println("Number is greater than 100.");
        } else if (number > 50) {
            System.out.println("Number is greater than 50 but not greater than 100.");
        } else if (number > 0) {
            System.out.println("Number is greater than 0 but not greater than 50.");
        } else if (number < 0) {
            System.out.println("Number is less than 0.");
        } else {
            System.out.println("Number is equal to 0.");
        }

        scanner.close();
    }
}
