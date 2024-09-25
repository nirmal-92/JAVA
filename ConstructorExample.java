import java.io.*;

public class ConstructorExample{
	ConstructorExample(){
		System.out.println("Contructor called");
	}
	public static void main(String[] args){
		ConstructorExample ce = new ConstructorExample();
	}
}