package lv.rvt;

public class Person {
    private String name;
    private String street;

    public Person(String name, String street) {
        this.name = name;
        this.street = street;
    }
    @Override
    public String toString(){
        return name + "\n   "+ street;
    }
    public static void main(String[] args) {
    Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
    Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");

    System.out.println(ada);
    System.out.println(esko);
    }
    

}