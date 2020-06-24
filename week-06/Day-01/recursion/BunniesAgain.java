public class BunniesAgain {
    public static void main(String[] args){
        System.out.println(bunnies(5));
    }

    public static int bunnies(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 0) {
            return 1 + bunnies(bunnies - 1);
        } else {
            return 2 + bunnies(bunnies -1);
        }
    }
}

