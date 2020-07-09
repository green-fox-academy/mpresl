package tests;

import java.util.ArrayList;

public class MathSum {
    ArrayList<Integer> nums = new ArrayList<>();


    public int sum(ArrayList<Integer> nums){

        int total = 0;
        for (int i = 0; i < nums.size(); i++) {
            total += nums.get(i);
        }

        return total;
    }
}

