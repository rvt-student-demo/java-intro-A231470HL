package lv.rvt;// klases atrašanās vieta projektā

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Scanner reader = new Scanner(System.in);

       // System.out.println("Enter the value of the gift: ");
        //int first =Integer.valueOf(reader.nextLine());
        
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("ievadiet skaitli");
            int number = scanner.nextInt();
            
            if( number == 0) {
                break;
            }
            count++;
            sum += number;

    }
    System.out.println("sik skaitļi tika ievadīti:"+ count);
    System.out.println("skaitļu summa:" + sum);

    }
}
