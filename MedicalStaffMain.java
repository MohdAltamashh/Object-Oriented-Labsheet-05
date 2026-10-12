class MedicalStaff {
    protected int staffId;
    protected String staffName;

    MedicalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
}

class Doctor extends MedicalStaff {
    private String specialization;

    Doctor(int staffId, String staffName, String specialization) {
        super(staffId, staffName);
        this.specialization = specialization;
    }

    void displayDoctor() {
        System.out.println("Doctor ID: " + staffId);
        System.out.println("Doctor Name: " + staffName);
        System.out.println("Specialization: " + specialization);
    }
}

class Pharmacist extends MedicalStaff {
    private String licenseNo;

    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        System.out.println("Pharmacist ID: " + staffId);
        System.out.println("Pharmacist Name: " + staffName);
        System.out.println("License Number: " + licenseNo);
    }
}

public class MedicalStaffMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(801, "Dr. Sana", "Pediatrics");
        Pharmacist pharmacist = new Pharmacist(802, "Ravi", "PH-8012");
        doctor.displayDoctor();
        System.out.println();
        pharmacist.displayPharmacist();
    }
}
