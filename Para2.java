// Define the Employee class
class Employee {
    public void work() {
        System.out.println("Employees are working");
    }
    public double getSalary() {
        return 0.0;
    }
}

class HRManager extends Employee {
    public void work() {
        System.out.println("HR Manager is working");
    }
    public void addEmployee(String employeeName) {
        System.out.println("HR Manager is adding employee: " + employeeName);
    }
}

public class Para2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        HRManager hrManager = new HRManager();
        employee.work();
        hrManager.work();
        hrManager.addEmployee("Nirmal");
}
}
