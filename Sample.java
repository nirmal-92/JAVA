import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string:");
        String inputString = scanner.nextLine();

        // Input the length of substrings
        System.out.println("Enter the length of substrings (k):");
        int k = scanner.nextInt();

        if (k > 0 && k <= inputString.length()) {
            // Find and print the lexicographically smallest and largest substrings
            findAndPrintLexicographicSubstrings(inputString, k);
        } else {
            System.out.println("Invalid length of substrings. Please enter a valid value.");
        }

        scanner.close();
    }

    private static void findAndPrintLexicographicSubstrings(String str, int k) {
        String smallestSubstring = str.substring(0, k);
        String largestSubstring = str.substring(0, k);

        for (int i = 1; i <= str.length() - k; i++) {
            String currentSubstring = str.substring(i, i + k);

            if (currentSubstring.compareTo(smallestSubstring) < 0) {
                smallestSubstring = currentSubstring;
            }

            if (currentSubstring.compareTo(largestSubstring) > 0) {
                largestSubstring = currentSubstring;
            }
        }

        System.out.println("Lexicographically smallest substring: " + smallestSubstring);
        System.out.println("Lexicographically largest substring: " + largestSubstring);
    }
}
