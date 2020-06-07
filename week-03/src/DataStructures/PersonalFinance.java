package DataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args){
        ArrayList<Integer> expenses = new ArrayList<>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);
        Collections.sort(expenses);

        int total = 0;

        for (int item:
             expenses) {
            total += item;
        }
        int average = total/expenses.size();

        System.out.println("Total Spent: "+total);
        System.out.println("Most expensive Item: "+expenses.get(expenses.size()-1));
        System.out.println("Least expensive item: "+expenses.get(0));
        System.out.println("Average spent: "+average);
    }
}
