public class Main1{
	static void myStaticMethod(){
		System.out.println("Static method can be called without creating objects");
	}
//Public method
public void publicMethod(){
		System.out.println("Public methods must be called by creating objects");
	}

//main method
public static void main(String[] args){
	//myStaticMethod();
	myPublicMethod();
		Main myObj = new Main();
		myObj.myPublicMethod();
	}
}