// Abstract class Person
abstract class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Abstract methods
    public abstract void eat();

    public abstract void exercise();

    // Getter method for name
    public String getName() {
        return name;
    }
}

// Subclass Athlete
class Athlete extends Person {
    // Constructor
    public Athlete(String name) {
        super(name);
    }

    // Implementation of abstract methods
    @Override
    public void eat() {
        System.out.println(getName() + " eats a balanced diet with a focus on protein.");
    }

    @Override
    public void exercise() {
        System.out.println(getName() + " exercises regularly, including cardio and strength training.");
    }
}

// Subclass LazyPerson
class LazyPerson extends Person {
    // Constructor
    public LazyPerson(String name) {
        super(name);
    }

    // Implementation of abstract methods
    @Override
    public void eat() {
        System.out.println(getName() + " enjoys fast food and snacks frequently.");
    }

    @Override
    public void exercise() {
        System.out.println(getName() + " prefers a sedentary lifestyle and avoids exercise.");
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        // Creating instances of Athlete and LazyPerson
        Athlete athlete = new Athlete("John");
        LazyPerson lazyPerson = new LazyPerson("Alice");

        // Calling eat() and exercise() methods for Athlete
        System.out.println("Athlete's Routine:");
        athlete.eat();
        athlete.exercise();
        System.out.println();

        // Calling eat() and exercise() methods for LazyPerson
        System.out.println("Lazy Person's Routine:");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
