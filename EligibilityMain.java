class Medicine {
    String medicineName;
    int ageLimit;

    Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }

    String checkEligibility(int patientAge) {
        // Local variable stores the method's result.
        String result;
        if (patientAge >= ageLimit) {
            result = "Eligible";
        } else {
            result = "Not Eligible";
        }
        return result;
    }
}

public class EligibilityMain {
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Example Medicine", 18);
        System.out.println("Age 25: " + medicine.checkEligibility(25));
        System.out.println("Age 12: " + medicine.checkEligibility(12));
    }
}
