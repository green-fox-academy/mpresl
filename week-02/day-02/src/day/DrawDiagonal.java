package day;

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int length = input.nextInt();

        int mid = length -2;

        for (int i = 0; i < length; i++) { //draws top line
            System.out.print("%");
        }
        System.out.println("");


        for (int s = 0; s < mid; s++) {
                System.out.print("%");
                for (int space = 0; space < s; space++) {
                    System.out.print(" ");
                }
                System.out.print("%");
                for (int back = mid-s-1; back >0; back--) {
                    System.out.print(" ");
                }
                    System.out.println("%");
        }



        for (int i = 0; i < length; i++) { //draws bot line
            System.out.print("%");
        }
    }
}
