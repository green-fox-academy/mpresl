import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        System.out.println(anagram("dog","god")); //True
        System.out.println(anagram("green", "fox")); //False
        System.out.println(anagram("green", "neerg")); //TRue
        System.out.println(anagram("green", "ggren")); //False
    }

    public static boolean anagram(String word1, String word2) {
        String[] letters1 = word1.split("");
        String[] letters2 = word2.split("");
        if (letters1.length != letters2.length) {
            return false;
        }
        Arrays.sort(letters1);
        Arrays.sort(letters2);
        return Arrays.equals(letters1, letters2);

//        for (int i = 0; i < letters1.length; i++) {
//            if (letters1[i] == letters2[i]) {
//                return false;
//            }
//        }
    }
}
