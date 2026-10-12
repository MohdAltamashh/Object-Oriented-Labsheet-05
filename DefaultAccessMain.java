class Pharmacy {
    // Default/package-private: no public, private or protected keyword.
    String medicineName;
    double price;

    // Default/package-private constructor.
    Pharmacy() {
        medicineName = "Paracetamol";
        price = 25.50;
    }

    // Default/package-private method.
    void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Price: " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.medicineName = "Cetirizine";
        pharmacy.price = 42.00;
        pharmacy.displayMedicine();
    }
}
