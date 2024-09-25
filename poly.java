class Animal{
    void makeSound(){
        System.out.println("Animals makes some noise!!");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("My Dog is Barking");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("My cat is growling");
    }
}

public class poly{
    public static void main(String[] args) {
        //Overloading
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();

        //Overriding
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        d1.makeSound();
        c1.makeSound();
    }
}