class Animal {
    public void Sound() {
        System.out.println("Animal makes a sound");
    }
}

class Bird extends Animal {
    public void Sound() {
        System.out.println("Bird chirps");
    }
}

class Cat extends Animal {
    public void Sound() {
        System.out.println("Cat meows");
    }
}

public class Para4 {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Bird myBird = new Bird();
        Cat myCat = new Cat();
        genericAnimal.Sound();
        myBird.Sound();
        myCat.Sound();
    }
}
