package day;
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter value in miles: ");
        double miles = input.nextDouble();
        double km = miles * 1.609;
        System.out.println("That is " + km + " kilometers!");

    }
}