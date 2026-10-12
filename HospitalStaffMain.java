class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private int employeeId;
    private double salary;
    static int employeeCount = 0; // Shared by all employees.

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        setSalary(salary);
        employeeCount++;
    }

    public int getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }

    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
        else System.out.println("Negative salary rejected.");
    }

    void displayEmployee() {
        System.out.println("Name: " + name + ", Age: " + age
                + ", ID: " + employeeId + ", Salary: " + salary);
    }
}

class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int age, int employeeId, double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    String getSpecialization() { return specialization; }

    @Override
    void displayEmployee() {
        super.displayEmployee();
        System.out.println("Role: Doctor, Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(String name, int age, int employeeId, double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    String getLicenseNo() { return licenseNo; }

    @Override
    void displayEmployee() {
        super.displayEmployee();
        System.out.println("Role: Pharmacist, License: " + licenseNo);
    }
}

class StaffManager {
    void displayStaff(Employee[] staff) {
        double totalSalary = 0; // Local variable used for processing.
        for (int i = 0; i < staff.length; i++) {
            staff[i].displayEmployee();
            totalSalary += staff[i].getSalary();

            if (staff[i] instanceof Doctor) {
                System.out.println("Department: Medical");
            } else if (staff[i] instanceof Pharmacist) {
                System.out.println("Department: Pharmacy");
            }
            System.out.println();
        }
        System.out.println("Total salary: " + totalSalary);
        System.out.println("Total employees created: " + Employee.employeeCount);
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Dr. Ayesha", 40, 901, 75000, "Cardiology"),
            new Pharmacist("Ravi", 31, 902, 38000, "PH-9090")
        };

        StaffManager manager = new StaffManager();
        manager.displayStaff(staff);
    }
}
