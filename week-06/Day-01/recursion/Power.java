public class Power {
    public static void main(String[] args){
        System.out.println(power(4,3));

    }
    public static int power(int base, int n){
        if (n == 0){
            return 1;
        }else {
            return base * power(base, n-1);
        }
    }
}
