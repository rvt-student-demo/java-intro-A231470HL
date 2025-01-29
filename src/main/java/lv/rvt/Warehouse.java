package lv.rvt;
public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        this.capacity = capacity;
        this.balance = 0;
    }

    public Warehouse(String string, double d) {
        //TODO Auto-generated constructor stub
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public void addToWarehouse(double amount) {
        if (amount > 0) {
            balance = Math.min(balance + amount, capacity);
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0;
        }
        double takenAmount = Math.min(amount, balance);
        balance -= takenAmount;
        return takenAmount;
    }

    @Override
    public String toString() {
        return "balance = " + balance + ", space left " + (capacity - balance);
    }
    public class ProductWarehouse extends Warehouse {
    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    @Override
    public String toString() {
        return productName + ": " + super.toString();
    }
}
}


