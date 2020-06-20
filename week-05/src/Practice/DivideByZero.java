package Practice;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int divisor = input.nextInt();

        try{
            System.out.println(divideByInput(divisor));
        } catch (Exception e){
            System.out.println("Fail!");
        }
    }

    public static double divideByInput(int x){
        int num = 10;
        double result = num/x;
        return result;
    }
}
