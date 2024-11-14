package lv.rvt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();

        System.out.println("Enter numbers:");

 
        while (true) {
            int skaitlis = scanner.nextInt();

            if (skaitlis == -1) {
                break;
            }
            
            statistics.addNumber(skaitlis);
        }

        System.out.println("Sum: " + statistics.getSum());
        
        scanner.close();
    }
}

