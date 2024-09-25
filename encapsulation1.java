import java.util.*;

class details{
    String name;
    String address;
    int marks;
    long phone_number;

    public String getname(){
		return name;
	}

	public void setname(String name){
		this.name=name;
	}

    public String getaddress(){
		return address;
	}

	public void setaddress(String address){
		this.address=address;
	}

    public int getmarks(){
		return marks;
	}

	public void setmarks(int marks){
		this.marks=marks;
	}

    public long getphone_number(){
		return phone_number;
	}

	public void setphone_number(int phone_number){
		this.phone_number=phone_number;
	}


}

public class encapsulation1 {
    public static void main(String args[]){
        details d = new details();
        try (Scanner sc = new Scanner(System.in)) {
          String name;
          String address;
          int marks;
          int phone_number;

          System.out.println("enter your name");
          name=sc.nextLine();

          System.out.println("enter your address");
          address=sc.nextLine();

          System.out.println("enter your marks");
          marks=sc.nextInt();

          System.out.println("enter your phone number");
          phone_number=sc.nextInt();

          d.setname(name);
          d.setaddress(address);
          d.setmarks(marks);
          d.setphone_number(phone_number);
        }
        System.out.println("name is " + d.getname());
        System.out.println("address is " + d.getaddress());
        System.out.println("mark is " + d.getmarks());
        System.out.println("phone number is " + d.getphone_number());

    }   
}