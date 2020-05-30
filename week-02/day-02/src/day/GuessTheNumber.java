package day;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 13;
        System.out.println("Guess the number:");
        int guess = input.nextInt();
        while (guess != number){
            if (guess > number){
                System.out.println("The stored number is lower");
            }else {
                System.out.println("The stored number is higher");
            }
            System.out.println("Guess again...");
            guess = input.nextInt();
        }
        System.out.println("You found the number: " + number);

    }
}
