package lv.rvt;// klases atrašanās vieta projektā

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi pirmo skaitli: ");

        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi otro skaili: ");

        int second = Integer.valueOf(scanner.nextLine());

        System.out.println(first + " + " + second+ " = " + (first+second));
        System.out.println(first + " - " + second+ " = " + (first-second));
        System.out.println(first + " * " + second+ " = " + (first*second));
        System.out.println(first + " / " + second+ " = " + ((double)first/second));


    }

}
