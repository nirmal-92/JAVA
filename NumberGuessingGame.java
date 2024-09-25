import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lower = 1;
        int upper = 100;
        int randomNumber = random.nextInt(upper - lower + 1) + lower;
        int numberOfAttempts = 0;
        boolean hasGuessedRightly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a random number between 1 and 100.");
        System.out.println("Try to guess it, or enter 0 to quit.");

        while (!hasGuessedRightly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess == 0) {
                System.out.println("You've quit the game. The random number was: " + randomNumber);
                break;
            } else if (userGuess < lower || userGuess > upper) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too Low.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too High.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                System.out.println("Number of attempts: " + numberOfAttempts);
                hasGuessedRightly = true;
            }
        }

        scanner.close();
    }
}
