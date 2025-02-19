package lv.rvt;

public class CD {
    private String author;
    private String name;
    private int year;
    
    
    public CD (String author, String name, int year){
        this.author = author;
        this.name = name;
        this.year = year;
    }

        @Override
        public String toString() {
            return author + ": " + name + " (" + year + ")";
        }
}

