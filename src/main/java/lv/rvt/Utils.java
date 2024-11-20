package lv.rvt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utils {

    // Method to read the file and return a BufferedReader
    public static BufferedReader getReader(String fileName) throws IOException {
        return new BufferedReader(new FileReader(fileName));
    }
    
    public static ArrayList<Person> readPersonsFromCSV(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();
        try (BufferedReader reader = getReader(fileName)) {
            String line;
            // Skip the header line
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0].trim();
                int age = Integer.parseInt(fields[1].trim());
                double weight = Double.parseDouble(fields[2].trim());
                double height = Double.parseDouble(fields[3].trim());

                // Create a new Person object and add it to the list
                persons.add(new Person(name, age, weight, height));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }
}
