class Hospital {
    // Public members can be accessed directly from another class.
    public String hospitalName;
    public String hospitalCode;

    public Hospital() {
        hospitalName = "City Care Hospital";
        hospitalCode = "CCH101";
    }

    public void displayHospital() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Hospital Code: " + hospitalCode);
    }
}

public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.hospitalName = "Central Hospital";
        hospital.hospitalCode = "CH202";
        System.out.println(hospital.hospitalName);
        System.out.println(hospital.hospitalCode);
        hospital.displayHospital();
    }
}
