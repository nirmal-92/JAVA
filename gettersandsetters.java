class Student {
    private String name;
    private String address;
    private String rollNo;
    private Long phonenumber;
    private Double marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getPhNo() {
        return phonenumber;
    }

    public void setPhoneNumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

}

class gettersandsetters {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("NIRMAL");
        student.setAddress("123 David Street, Warsaw-67.");
        student.setRollNo("22CS114");
	student.setPhNo("6369188565");
	student.setMarks(8.65);

        System.out.println("Name: " + student.getName());
	System.out.println("Roll No.: " + student.getRollNo());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Phone Number: " + student.getPhNo());
	System.out.println("Marks: " + student.getMarks());
    }
}