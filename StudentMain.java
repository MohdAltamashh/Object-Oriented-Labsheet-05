class Student {
    String name;
    int rollNo;
    double marks;

    // No-argument constructor initializes suitable default values.
    Student() {
        this.name = "Altamash";
        this.rollNo = 101;
        this.marks = 85.5;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}
