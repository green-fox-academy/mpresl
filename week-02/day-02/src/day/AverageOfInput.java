package day;
import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        double average = (num1 + num2 + num3 + num4 + num5)/5;
        System.out.println("The average is: " + average);

    }
}
