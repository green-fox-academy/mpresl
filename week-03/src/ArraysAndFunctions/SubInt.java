package ArraysAndFunctions;

import java.util.Arrays;
import java.util.ArrayList;

public class SubInt {
    public static void main(String[] args){
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    }
    public static String subInt(int num, int[] array){
        ArrayList<Integer> newList = new ArrayList<Integer>();


        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            int rem =  item % 10;

            while (item > 0) {
                if (item == num){
                    newList.add(i);
                    break;
                }else if (rem == num) {
                    newList.add(i);
                    break;
                }
                item = item/10;
            }

        }
        return Arrays.toString(newList.toArray());
    }
}
//  Create a ArraysAndFunctions.function that takes a number and an array of integers as a parameter
//  Returns the indices of the integers in the array of which the first number is a part of
//  Or returns an empty array if the number is not part of any of the integers in the array

////  Example:
//    System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
//            //  should print: `[0, 1, 4]`
//            System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
//  should print: '[]'

