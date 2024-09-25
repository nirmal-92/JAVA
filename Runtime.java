import java.util.Scanner;

class Vehicle {
    String color;
    int maxSpeed;
    int numSeats;
    int numWheels;
    boolean hasDiskBrakes;

    public void displayDetails() {
        System.out.println("Color: " + color);
        System.out.println("Maximum Speed: " + maxSpeed + " km/h");
        System.out.println("Number of Seats: " + numSeats);
        System.out.println("Number of Wheels: " + numWheels);
        System.out.println("Disk Brakes: " + (hasDiskBrakes ? "Yes" : "No"));
    }
}

class Car extends Vehicle {
    public Car(String color, int maxSpeed, int numSeats, int numWheels, boolean hasDiskBrakes) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.numSeats = numSeats;
        this.numWheels = numWheels;
        this.hasDiskBrakes = hasDiskBrakes;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        super.displayDetails();
    }
}

class Bike extends Vehicle {
    public Bike(String color, int maxSpeed, int numSeats, int numWheels, boolean hasDiskBrakes) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.numSeats = numSeats;
        this.numWheels = numWheels;
        this.hasDiskBrakes = hasDiskBrakes;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Details:");
        super.displayDetails();
    }
}

public class Runtime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a vehicle (1 for Car, 2 for Bike):");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter maximum speed (km/h): ");
        int maxSpeed = scanner.nextInt();

        System.out.print("Enter number of seats: ");
        int numSeats = scanner.nextInt();

        System.out.print("Enter number of wheels: ");
        int numWheels = scanner.nextInt();

        System.out.print("Does it have disk brakes? (true/false): ");
        boolean hasDiskBrakes = scanner.nextBoolean();

        scanner.close();

        Vehicle vehicle;
        if (choice == 1) {
            vehicle = new Car(color, maxSpeed, numSeats, numWheels, hasDiskBrakes);
        } else if (choice == 2) {
            vehicle = new Bike(color, maxSpeed, numSeats, numWheels, hasDiskBrakes);
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        vehicle.displayDetails();
    }
}


