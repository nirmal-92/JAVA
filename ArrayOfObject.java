class Student{
	Student(int id, String name){
		System.out.println("Student ID is "+ id + " and the name of the student is "+ name );
	}
}

public class ArrayOfObject{
	public static void main(String[] args){
		Student obj[] = new Student[4];

		obj[0] = new Student(1,"Mithunes");		
		obj[1] = new Student(2,"Nithin");
		obj[2] = new Student(3,"Nirmal");
		obj[3] = new Student(4,"Karmukilan");
	}
}