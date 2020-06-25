public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(divisor(81,18));
    }
    public static int divisor(int num1, int num2){
        if (num1 == 0){
            return num2;
        }
        if (num2 == 0){
            return num1;
        }
        if (num1 == num2){
            return num1;
        }
        if (num1 > num2){
            return divisor(num1 - num2, num2);
        }
        return divisor(num1, num2 - num1);

    }
}
