public class Sum {
    public static void main(String[] args){
        System.out.println(sum(10));
    }
    public static int sum(int max){
        int total = 0;
        for (int i = 0; i <= max; i++) {
            total += i;
        }
        return total;
    }
}
