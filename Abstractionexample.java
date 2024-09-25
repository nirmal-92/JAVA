//Java abstraction

//Abstract class declared
abstract class Animal{
	private String name;
	public Animal(String name) {this.name = name;}
	public abstract void makeSound();
	public String getname() {return name;}
}

//Abstracted class
class Dog extends Animal{
	public Dog(String name) {super(name);}
	public void makeSound(){
		System.out.println(getname() + " barks");
	}
}

//Abstracted class
class Cat extends Animal{
	public Cat(String name) {super(name);}
	public void makeSound(){
		System.out.println(getname() + " meows");
	}
}
public class Abstractionexample{
	//Main function
	public static void main(String args[]){
		Animal myDog = new Dog("Buddy");
		Animal myCat = new Cat("Fluffy");
	
		myDog.makeSound();
		myCat.makeSound();
	}
}
	