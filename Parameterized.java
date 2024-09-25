import java.io.*;
class Data{
	String name = "Ramu";
	int id = 99;
	Data(String name, int id)
	{
		this.name = name;
		this.id = 99;
	}
}
public class Parameterized{
	public static void main(String[] args){
		Data data = new Data("Sanjay", 101);
		System.out.println("Name :" + data.name + " and Id :" + data.id);
	}
}