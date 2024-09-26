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
        System.out.println("Ievadiet skaitli no kura sāksiet skaitīt līdz 100: ");
        int skaitlis = scanner.nextInt();
        while (skaitlis <= 100) {
            System.out.println(skaitlis);
            skaitlis++;

        }

    }
}
