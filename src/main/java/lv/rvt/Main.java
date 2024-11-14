package lv.rvt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create three Statistics objects
        Statistics statistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int skaitlis = scanner.nextInt();

            if (skaitlis == -1) {
                break;
            }

            statistics.addNumber(skaitlis);

            if (skaitlis % 2 == 0) {
                evenStatistics.addNumber(skaitlis);  
            } else {
                oddStatistics.addNumber(skaitlis);   
            }
        }

        System.out.println("Sum: " + statistics.getSum());
        System.out.println("Sum of even numbers: " + evenStatistics.getSum());
        System.out.println("Sum of odd numbers: " + oddStatistics.getSum());

        scanner.close();  // Close the scanner
    }
}

