class Animal {
    // Method in the base class
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Main class to demonstrate dynamic binding
public class DynamicBinding {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Animal myDog = new Dog();

        // Calling overridden method at runtime
        myDog.makeSound(); 
    }
}
