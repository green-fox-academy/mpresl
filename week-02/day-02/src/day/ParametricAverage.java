package day;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float total = 0;
        int count = 0;


        while(true){
            System.out.println("Enter a Number and Press Enter(0 to end)");
            int add = input.nextInt();
            if (add == 0){
                break;
            }
            count++;
            total += add;
            float average = total/count;
            System.out.println("Sum: "+total+", Average: "+average+", Numbers: "+count);

        }

    }
}
