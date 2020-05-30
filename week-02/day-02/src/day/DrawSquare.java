package day;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int length = input.nextInt();
        for (int i = 0; i < length; i++) { //draws top line
            System.out.print("%");
        }
        System.out.println("");
        for (int i = 0; i < length-2; i++){
            System.out.print("%");
            for (int space = 0; space < length - 2; space ++){
                System.out.print(" ");
            }
            System.out.println("%");
        }
        for (int i = 0; i < length; i++) { //draws bot line
            System.out.print("%");
        }
    }
}
