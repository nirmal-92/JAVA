class Vehicle {
    private int speed;

    public Vehicle() {
        speed = 0;
    }

    public void speedUp() {
        speed += 5;
    }

    public int getSpeed() {
        return speed;
    }
}
class Car extends Vehicle {
    public void speedUp() {
        super.speedUp(); 
        super.speedUp();
        super.speedUp();
        super.speedUp();
        super.speedUp();
    }
}
class Bicycle extends Vehicle {
    public void speedUp() {
        super.speedUp();
        super.speedUp();
    }
}

public class Demo {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bicycle();

        vehicle1.speedUp(); 
        vehicle2.speedUp();

        System.out.println("Car Speed: " + vehicle1.getSpeed());
        System.out.println("Bicycle Speed: " + vehicle2.getSpeed());
    }
}
