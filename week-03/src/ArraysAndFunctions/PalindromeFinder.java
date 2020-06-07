package ArraysAndFunctions;

import java.util.ArrayList;

public class PalindromeFinder {
    public static void main(String[] args){
        System.out.println(PalindromeSearcher("racecar"));
        System.out.println(PalindromeSearcher("dog goat dad duck doodle never"));
        System.out.println(PalindromeSearcher("apple"));
    }

    public static ArrayList PalindromeSearcher(String original){
        ArrayList<String> palindrome = new ArrayList<>();
        for (int i = 0; i < original.length(); i++) {
            for (int j = i+1; j < original.length()+1 ; j++) {
                if (isPalindrome(original.substring(i,j))){
                    palindrome.add(original.substring(i,j));
                }
            }
        }
        return palindrome;
    }

    public static boolean isPalindrome(String word){
        StringBuilder normal = new StringBuilder(word);
        StringBuilder reverse = normal.reverse();
        if (word.length() < 3){
            return false;
        }
        return (reverse.toString()).equals(word);
    }
}
