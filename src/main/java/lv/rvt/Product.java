package lv.rvt;

public class Product {
    private String name;
    private int quantity;
    private double price;
    
    public Product (String name, double price, int quantity){
        this.name = name ;
        this.price = price;
        this.quantity = quantity;
    }
    public void printProduct(){
        System.out.println(this.name+", "+"Price"+" "+this.price+", "+this.quantity+" pcs");
    }
}
