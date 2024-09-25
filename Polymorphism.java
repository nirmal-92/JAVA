
class Animal {
    // Method in the base class
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Subclass Dog inheriting from Animal
class Dog extends Animal {
    // Method overriding: Providing a specific implementation for makeSound in Dog
    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    // Additional method in Dog
    void fetch() {
        System.out.println("Fetching the ball");
    }
}

// Subclass Cat inheriting from Animal
class Cat extends Animal {
    // Method overriding: Providing a specific implementation for makeSound in Cat
    @Override
    void makeSound() {
        System.out.println("Meow");
    }

    // Additional method in Cat
    void scratch() {
        System.out.println("Scratching");
    }
}

// Main class to demonstrate polymorphism
public class Polymorphism {
    public static void main(String[] args) {
        // Example 1: Method Overloading
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        animal1.makeSound();  // Some generic sound
        animal2.makeSound();  // Bark
        animal3.makeSound();  // Meow

        // Example 2: Method Overriding
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.makeSound();  // Bark
        myCat.makeSound();  // Meow
    }
}
