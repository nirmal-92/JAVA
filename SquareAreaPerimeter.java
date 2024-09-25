import java.util.Scanner;

public class SquareAreaPerimeter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");

        double sideLength = scanner.nextDouble();

        scanner.close();

        double area = sideLength * sideLength;
        double perimeter = 4 * sideLength;

        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);
    }
}
