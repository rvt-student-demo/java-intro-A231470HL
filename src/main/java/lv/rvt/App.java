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
        System.out.println("dodiet ciparu ");
        int faktorials = scanner.nextInt();
        int sum = 1;
        for (int i = 1; i <= faktorials; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
