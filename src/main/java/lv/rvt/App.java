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
        System.out.println("cik rindas?");
        int reizes = scanner.nextInt();
        for (int i = 0; i< reizes; i++){
            System.out.println("In a hole in the ground there lived a method");
        }
    }
}
