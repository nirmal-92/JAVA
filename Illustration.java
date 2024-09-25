//Illustartion class
class Illustration{
	
	//declaring an instance variable
	int instanceVar = 5;
	//declaring an static variable
	static int staticVar = 10;

	void Scalar(){
		//Method-Specifier variable
		int instanceVar = 20;
		int staticVar = 40;
		
		//refering to the current class instance ans static variable
		this.instanceVar = 20;
		this.staticVar = 100; 

		//printing the current class instance and static variable
		System.out.println("Value of instance variable: "+ this.instanceVar);
		System.out.println("Value of static variable: "+ this.staticVar);

		//printing the method specifier variable
		System.out.println("instanceVar inside method: "+ instanceVar);
		System.out.println("staticVar inside method: "+ staticVar);
	}
}

public class Illustration{
	public static void main(String[] arsg){
		//creating an instance of illustration class
		Illustration obj = new Illustration(); 
		obj.Scalar();
	}
}
		