class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}
class Car extends Vehicle {
    public void drive() {
        System.out.println("Repairing a car");
    }
}

public class VVehicle {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();
        myVehicle.drive();
        myCar.drive();
    }
}
