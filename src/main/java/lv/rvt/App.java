package lv.rvt;// klases atrašanās vieta projektā

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadi savu vārdu");
        String name = scanner.nextLine();
        System.out.println("ievadi savu uzvārdu");
        String uzvards = scanner.nextLine();
        System.out.println("ievadi savu grupas nosaukumu");
        String grupa = scanner.nextLine();
        //String name = "Jaroslavs";
        //int age = 17;
        //boolean isOnline = true;

        System.out.println("Tu ievadīji");
        System.out.println(name);
        System.out.println(uzvards);
        System.out.println(grupa);


    }

}
