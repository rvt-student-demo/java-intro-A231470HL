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
