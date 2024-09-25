import java.util.*;

public class HappyNumber {
    public static int isNumHappy(int num) {
        int rem = 0, sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }
    
public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int finalVal = num;
            while (finalVal != 1 && finalVal != 4) {
                finalVal = isNumHappy(finalVal);
            }
            if (finalVal == 1) {
                System.out.println("True");
            } 
else {
                System.out.println("False");
            }
        }
    }
}