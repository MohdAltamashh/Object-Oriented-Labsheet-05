class Patient {
    private String patientName;
    private int age;
    private double weight;

    Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        setAge(age);
        setWeight(weight);
    }

    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age rejected.");
        }
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight rejected.");
        }
    }

    void displayPatient() {
        System.out.println("Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}

public class PatientValidationMain {
    public static void main(String[] args) {
        Patient patient = new Patient("Aman", 28, 68.5);
        patient.setAge(30);       // Valid update.
        patient.setAge(-4);       // Invalid update is rejected.
        patient.setWeight(70.0);  // Valid update.
        patient.setWeight(0);     // Invalid update is rejected.
        patient.displayPatient();
    }
}
