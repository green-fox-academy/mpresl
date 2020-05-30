package day;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to start:");
        int start = input.nextInt();
        System.out.println("Enter a number to count to:");
        int end = input.nextInt();
        for (int i = start; i <= end; i++){
            System.out.println(i);
        }
    }
}
