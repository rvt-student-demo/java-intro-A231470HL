package lv.rvt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Path to your CSV file
        String fileName = "/workspaces/java-intro-A231470HL/src/main/resources/persons.csv";
        
        // Step 3: Read the persons from the CSV file
        ArrayList<Person> persons = Utils.readPersonsFromCSV(fileName);
        
        // Step 4: Print each person using a for-each loop
        for (Person person : persons) {
            System.out.println(person);
        }

        // Step 4.1: Calculate the average age
        int totalAge = 0;
        for (Person person : persons) {
            totalAge += person.getAge();
        }

        double averageAge = (double) totalAge / persons.size();
        System.out.println("Average Age: " + averageAge);
    }
}
