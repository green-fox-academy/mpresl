package day;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int lines = input.nextInt();
        if (lines % 2 == 0){
            lines++;
        }

        for (int i = 1; i < lines; i += 2) {
            for (int k = lines; k >= i; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= lines; i += 2) {
            for (int k = 1; k <= i; k += 2) {
                System.out.print(" ");
            }
            for (int j = lines; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}