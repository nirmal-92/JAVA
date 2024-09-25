class electronics {
	void display(){
		System.out.println("This is an electronic device");
	}
}

class grinder extends electronics {
	void  prin(){
		System.out.println("This is a grinder");	
	}	
}

class wetgrinder extends grinder {
	void show(){
		System.out.println("This is a wetgrinder");
	}	
}

public class electronics {
	public static void main(String[] args){
		wetgrinder obj = new wetgrinder();
		obj.display();
		obj.prin();
		obj.show();	
	}
}