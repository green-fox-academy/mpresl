package day;
import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many Chickens do you have? ");
        int chickens = input.nextInt();

        System.out.println("How many pigs do you own?");
        int pigs = input.nextInt();

        int chickenLegs = chickens * 2;
        int pigLegs = pigs * 4;
        int totalLegs = chickenLegs + pigLegs;

        System.out.println("That is " + totalLegs+" Legs!");


    }
}
