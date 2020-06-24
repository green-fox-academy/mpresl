public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibNum(0));
        System.out.println(fibNum(1));
        System.out.println(fibNum(2));
        System.out.println(fibNum(3));
        System.out.println(fibNum(4));
        System.out.println(fibNum(5));
        System.out.println(fibNum(6));
    }
    public static int fibNum(int num){
        if (num <= 0) {
            return 0;
        }
        if (num == 1){
            return 1;
        }
        return fibNum(num-1) + fibNum(num - 2);
    }
}
