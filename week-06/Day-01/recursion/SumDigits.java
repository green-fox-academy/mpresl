public class SumDigits {
    public static void main(String [] args){
//        System.out.println(totalDigits(123));
        System.out.println(sumDigits(1234));
    }
    public static int sumDigits(int num){
        if (num > 0) {
            return (num % 10) + sumDigits(num / 10);
        }else {
            return 0;
        }
    }
//    public static int totalDigits(int num){
//        int sum = 0;
//        sum += num % 10;
//        num = num/10;
//        sum += num% 10;
//        num = num/10;
//        sum += num % 10;
//        return sum;
//    }
}
