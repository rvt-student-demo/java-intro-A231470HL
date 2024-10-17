package lv.rvt; // klases atrašanās vieta projektā

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static class Main {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Enter a number (0 to stop): ");
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                numbers.add(number);
            }

            int totalSum = 0;
            for (int num : numbers) {
                totalSum += num;
            }

            System.out.println( totalSum);
            
            if (numbers.size() > 2) {
                System.out.println("Sum of second and third numbers: " + (numbers.get(1) + numbers.get(2)));
            } else {
                System.out.println("Not enough numbers.");
            }

            scanner.close();
        }
    }
}

