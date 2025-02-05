package lv.rvt;

public class Main {
    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice); // Juice: balance = 989.7, space left 10.3

        // Printing the change history
        System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        // Print detailed analysis
        juice.printAnalysis();
    }
}
