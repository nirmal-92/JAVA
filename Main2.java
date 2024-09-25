class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat barks");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Animal genAnimal = new Animal();
        Cat myCat = new Cat();
        genAnimal.makeSound();
        myCat.makeSound();
    }
}
