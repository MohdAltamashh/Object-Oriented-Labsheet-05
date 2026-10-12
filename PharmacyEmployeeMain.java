class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    static int employeeCount = 0; // Class variable shared by all employees.

    // Protected member is available to child classes.
    protected String department;

    // Default/package-private status field: no access keyword.
    String status;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        setSalary(salary);
        this.department = "Pharmacy";
        this.status = "Active";
        employeeCount++;
    }

    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
        else System.out.println("Negative salary rejected.");
    }

    void displayEmployee() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Status: " + status);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Role: Pharmacist");
        System.out.println("License Number: " + licenseNo);
    }
}

class StoreManager extends Employee {
    private int storeSection;

    StoreManager(int employeeId, String employeeName, double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }

    void displayStoreManager() {
        displayEmployee();
        System.out.println("Role: Store Manager");
        System.out.println("Store Section: " + storeSection);
    }
}

class PharmacyEmployeeProcessor {
    void processEmployees(Employee[] employees) {
        int activeCount = 0; // Local variable inside processing method.
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if ("Active".equals(employee.status)) activeCount++;

            if (employee instanceof Pharmacist) {
                ((Pharmacist) employee).displayPharmacist();
            } else if (employee instanceof StoreManager) {
                ((StoreManager) employee).displayStoreManager();
            } else {
                employee.displayEmployee();
            }
            System.out.println();
        }
        System.out.println("Active employees: " + activeCount);
        System.out.println("Total Employee objects created: " + Employee.employeeCount);
    }
}

public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Pharmacist(1001, "Sara", 36000, "PH-2026"),
            new StoreManager(1002, "Imran", 45000, 3)
        };

        PharmacyEmployeeProcessor processor = new PharmacyEmployeeProcessor();
        processor.processEmployees(employees);
    }
}
