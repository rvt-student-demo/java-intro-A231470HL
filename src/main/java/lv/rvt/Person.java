package lv.rvt;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.age = 0;
        this.name = name;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
}