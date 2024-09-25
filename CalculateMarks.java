import java.util.Scanner;

public class CalculateMarks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1 (out of 100): ");
        int subject1Marks = scanner.nextInt();

        System.out.print("Enter marks for Subject 2 (out of 100): ");
        int subject2Marks = scanner.nextInt();

        System.out.print("Enter marks for Subject 3 (out of 100): ");
        int subject3Marks = scanner.nextInt();

        scanner.close();

        int totalMarks = subject1Marks + subject2Marks + subject3Marks;

        double percentageMarks = (double) totalMarks / 300 * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage Marks: " + percentageMarks + "%");
    }
}
