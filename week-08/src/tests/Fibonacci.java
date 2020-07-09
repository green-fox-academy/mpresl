package tests;

public class Fibonacci {

    public int fibNum(int num){
        if (num <= 0) {
            return 0;
        }
        if (num == 1){
            return 1;
        }
        return fibNum(num-1) + fibNum(num - 2);
    }
}
