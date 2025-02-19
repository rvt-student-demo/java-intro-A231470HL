package lv.rvt;

public class box {
    public interface packable {
        double weight();
    }
    public static void main(String[] args) {
        book book1 = new book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        book book2 = new book("Robert Martin", "Clean Code", 1);
        book book3 = new book("Kent Beck", "Test Driven Development", 0.5);
    
        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);
    
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
    }
}

