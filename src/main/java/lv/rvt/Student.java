package lv.rvt;

public class Student {

    private int credits;
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
        this.credits = 0;
    }

    public void study() {
        credits++;
    }

    public int credits() {
        return credits;
    }

    @Override
    public String toString() {
        return name + "\n   "+ address + "\n    " +"Study credits " +credits;
    }
    public static void main(String[] args) {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        ollie.study();
        System.out.println(ollie);
    }
}