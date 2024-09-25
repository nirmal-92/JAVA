public class StaticBinding {

    // Method with two integer parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method with two double parameters
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Calling the add method with two integers
        int resultInt = add(5, 10);
        System.out.println("Sum (int): " + resultInt);

        // Calling the add method with two doubles
        double resultDouble = add(3.5, 7.2);
        System.out.println("Sum (double): " + resultDouble);
    }
}
