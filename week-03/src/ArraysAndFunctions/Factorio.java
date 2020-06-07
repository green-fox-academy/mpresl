package ArraysAndFunctions;

public class Factorio {
    public static void main(String[] args){
        System.out.println(factorio(5));
        System.out.println(factorio(3));
        System.out.println(factorio(4));
        System.out.println(factorio(9));



    }
    public static int factorio(int max){
        int ans = 1;
        for (int i = 1; i < max + 1; i++) {
            ans *= i;
        }
        return ans;
    }
}
