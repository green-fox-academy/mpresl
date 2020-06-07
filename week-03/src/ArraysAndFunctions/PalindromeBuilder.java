package ArraysAndFunctions;

import java.util.ArrayList;

public class PalindromeBuilder {
    public static void main(String[] args){
        System.out.println(makePalindrome("Herewego"));
        System.out.println(makePalindrome("123"));
        System.out.println(makePalindrome("I am awesome"));
    }

    public static String makePalindrome(String original){
        String reverseWord = "";
        int wordLength = original.length();
        for (int i = wordLength-1; i >= 0 ; i--) {
            reverseWord += original.charAt(i);
        }
        String palindrome = original + reverseWord;
        return palindrome;

//        ArrayList<Character> palindrome = new ArrayList<>();
//        char[] word = original.toCharArray();
//
//        for (int i = 0; i < word.length ; i++) {
//            palindrome.add(word[i]);
//        }
//        int n = word.length-1;
//        for (int i = n; i >= 0 ; i--) {
//            palindrome.add(word[i]);
//        }
//        String pali = "";
//        for (int i = 0; i < palindrome.size(); i++) {
//            pali += palindrome.get(i);
//        }
//        return pali;
    }
}
