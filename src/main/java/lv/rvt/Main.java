package lv.rvt;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
            ArrayList<Person> persons = PersonManager.getPersonList();
            for (Person person : persons) {
                System.out.println(person);
            }
    }
}
