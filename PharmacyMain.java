class Pharmacy {
    String pharmacyName;
    String location;
    static int pharmacyCount = 0; // Shared by every Pharmacy object.

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }

    void displayPharmacy() {
        System.out.println("Pharmacy Name: " + pharmacyName);
        System.out.println("Location: " + location);
    }

    static void displayPharmacyCount() {
        System.out.println("Total pharmacies created: " + pharmacyCount);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("Care Pharmacy", "Saharanpur");
        Pharmacy p2 = new Pharmacy("Health Plus", "Dehradun");
        Pharmacy p3 = new Pharmacy("City Pharmacy", "Roorkee");

        p1.displayPharmacy();
        p2.displayPharmacy();
        p3.displayPharmacy();
        Pharmacy.displayPharmacyCount();
    }
}
