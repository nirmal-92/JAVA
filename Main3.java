//CNG Car interface
interface CNG_Car{

	//Abstract methods
	void drive();
	void CNG_kit();
}

//Petrol Car interface
interface Petrol_Car{

	//Abstract methods
	void drive();
	void petrol_kit();
}

class Hybrid_Car implements Petrol_Car, CNG_Car{
	public void drive(){
		System.out.println("Driving a Hybrid Car");
	}
	public void cng_kit(){
		System.out.println("Using the CNG Kit for Hybrid Car ");
	}
	public void petrol_kit(){
		System.out.println("Using the Petrol Kit for Hybrid Car ");
	}
}

//Drive Code
class Main3{
	public static void main(String[] args){
		Hybrid_Car obj = new Hybrid_Car();
		//Calling the methods of the Hybrid_car class
		obj.drive();
		obj.cng_kit();
		obj.petrol_kit();
	}
}
		
