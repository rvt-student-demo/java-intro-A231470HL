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

        while (true) {
            System.out.println("Ievadi ciparu: ");
            int cipars = Integer.valueOf(scanner.nextLine());

            if (cipars == 0) {
                break;
            }

            if (cipar < 0) {
                System.out.println("Nederīgs cipars");
                continue;
            }

            System.out.println(cipar * cipar);
        }
    }

}
