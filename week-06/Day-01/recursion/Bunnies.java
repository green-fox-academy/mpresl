public class Bunnies {
    public static void main(String[] args){
        System.out.println(bunnyEars(4));
    }
    public static int bunnyEars(int bunnies){
        if (bunnies == 1){
            return 2;
        }else {
            return 2+bunnyEars(bunnies-1);
        }
    }
}
