class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

public class PrivateAccessMain {
    public static void main(String[] args) {
        Employee employee = new Employee(1001, "Ravi", 35000.00);
        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getSalary());
        employee.displayEmployee();

        // Not allowed: employee.salary (salary is private).
    }
}
