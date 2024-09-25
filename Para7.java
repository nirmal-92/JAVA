class Employee {
    private String name;
    private int employeeId;
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public double calculateSalary() {
        return 0.0;
    }
    public String getName() {
        return name;
    }
    public int getEmployeeId() {
        return employeeId;
    }
}

class Manager extends Employee {
    private double baseSalary;
    public Manager(String name, int employeeId, double baseSalary) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
    }
    public double calculateSalary() {
        return baseSalary * 1.20;
    }
}
class Programmer extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    public Programmer(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Para7 {
    public static void main(String[] args) {
        Manager manager = new Manager("Praveen Kumar", 101, 5000.0);
        Programmer programmer = new Programmer("Nirmal", 102, 30.0, 160);
        System.out.println("Manager " + manager.getName() + " (ID: " + manager.getEmployeeId() + ") Salary: $" + manager.calculateSalary());
        System.out.println("Programmer " + programmer.getName() + " (ID: " + programmer.getEmployeeId() + ") Salary: $" + programmer.calculateSalary());
    }
}
