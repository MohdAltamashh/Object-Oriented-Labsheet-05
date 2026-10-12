class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("Patient ID: " + patientId
                + ", Name: " + patientName + ", Age: " + age);
    }
}

class PatientManager {
    void displayAllPatients(Patient[] patients) {
        // i is a local variable, valid only inside this method.
        for (int i = 0; i < patients.length; i++) {
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(1, "Aman", 25),
            new Patient(2, "Sara", 32),
            new Patient(3, "Ravi", 41),
            new Patient(4, "Ayesha", 19),
            new Patient(5, "Imran", 56)
        };

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}
