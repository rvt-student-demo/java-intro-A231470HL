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
        int sum = 0 ;
        while (true) {
        int skaitlis = scanner.nextInt();
        if (skaitlis == -1) {
            break;

        }
        sum = sum + skaitlis;
        }
        System.out.println("tnx bye!");
            System.out.println(sum);
    }
}
 