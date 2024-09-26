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
        int starts = scanner.nextInt();
        int beigas = 100;
        for (int i = starts; i <= beigas; i++) {
            System.out.println(i);

        }
    }
}
