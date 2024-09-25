public class Employee{
    private String name;
    private int salary;
    private int workingHours;

    public Employee(String name, int salary, int workingHours){
        this.name = name;
        this.salary = salary;
        this.workingHours = workingHours;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getWorkingHours(){
        return workingHours;
    }
    public void setWorkingHours(int workingHours){
        this.workingHours = workingHours;
    }

    public void increaseSalary(){
        int hourlyrate = 10;
        int addSalary = 10 * hourlyrate;
        salary += addSalary;
    }

    public void display(){
        System.out.println("Employee name :" +name);
        System.out.println("Employee salary :" +salary);
        System.out.println("Employee working hours :" +workingHours);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Nirmal", 230000, 34);
        emp.display();
        emp.increaseSalary();
        emp.display();
    }

}