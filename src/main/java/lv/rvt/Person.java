package lv.rvt;

public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    // Constructor
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // toString() for printing person details
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", height=" + height + ", weight=" + weight + "}";
    }
}
