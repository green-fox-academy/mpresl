package day;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int size = input.nextInt();
        for (int i = 1; i <= size; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
