package lv.rvt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Add students to the list
        students.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
        
        // Call the printStudent method
        printStudents(students);
    }

    // Method to print the students
    public static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
