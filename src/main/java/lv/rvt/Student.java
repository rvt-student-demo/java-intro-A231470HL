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

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return name + "\n   " + address + "\n    " + "Study credits: " + credits;
    }
}

class Teacher {
    private String name;
    private String address;
    private int salary;

    public Teacher(String name, String address, int salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + "\n   " + address + "\n    " + "Salary: " + salary;
    }
}

class Main {
    public static void main(String[] args) {
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
            ollie.study();
            i = i + 1;
        }
        System.out.println(ollie);
    }
}
