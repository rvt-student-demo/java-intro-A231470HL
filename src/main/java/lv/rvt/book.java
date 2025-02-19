package lv.rvt;

public class book {
    private String author;
    private String name;
    private double weight;
    
    public book(String author, String name, double weight){
        this.author = author;
        this.name = name;
        this.weight = weight;
    }
    @Override
        public String toString() {
            return author + ": " + name + " (" + weight + ")";
        }
}
