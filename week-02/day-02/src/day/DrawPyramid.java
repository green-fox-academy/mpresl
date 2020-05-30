package day;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int lines = input.nextInt();
        int spaces = lines;

        for (int i = 1; i <= lines; i++) {
            for (int k=1; k < spaces; k++) {
                System.out.print(" ");
            }
            spaces--;
            for (int stars = 1; stars <+ 2*i; stars++) {
                System.out.print("*");
                }
                System.out.println("");
            }

        }
    }