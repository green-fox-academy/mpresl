package day;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.println("This number is Even!");
        } else {
            System.out.println("This number is Odd");
        }
    }
}
