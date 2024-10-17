package lv.rvt;
import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Random rand = new Random(10);
        int nextInt = rand.nextInt(10) +1;
        int guess;
        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");
        for (int i = 0; i<3;i++){
            System.out.println("enter your guess: ");
            guess = Integer.parseInt(scanner.nextLine());
            if(nextInt == guess){
                System.out.println("RIGHT!");
                return;
            }else{
                System.out.println("Wrong! Try again.");
            }
        }
        System.out.println("Sorry, the number was " + nextInt);
    }

}

