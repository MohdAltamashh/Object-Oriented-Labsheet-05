class MedicineProduct {
    private String medicineName;
    private String batchNo;
    private double price;

    MedicineProduct(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    public String getMedicineName() { return medicineName; }
    public String getBatchNo() { return batchNo; }
    public double getPrice() { return price; }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setPrice(double price) {
        if (price >= 0) this.price = price;
        else System.out.println("Price cannot be negative.");
    }

    void displayProduct() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Batch: " + batchNo);
        System.out.printf("Price: %.2f%n", price);
    }
}

public class MedicineProductMain {
    public static void main(String[] args) {
        MedicineProduct product =
                new MedicineProduct("Vitamin C", "VC123", 120.00);
        product.setPrice(135.00); // Update through setter.
        System.out.println("Updated medicine: " + product.getMedicineName());
        product.displayProduct();
    }
}
