class Medicine {
    String medicineName;
    String batchNo;
    double price;

    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void displayMedicine() {
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Batch Number: " + batchNo);
        System.out.printf("Price: %.2f%n", price);
    }
}

public class MedicineMain {
    public static void main(String[] args) {
        Medicine first = new Medicine("Paracetamol", "PCM101", 25.50);
        Medicine second = new Medicine("Cetirizine", "CTZ202", 42.00);
        first.displayMedicine();
        System.out.println();
        second.displayMedicine();
    }
}
