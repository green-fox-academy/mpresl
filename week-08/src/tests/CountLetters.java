package tests;

import java.util.HashMap;

public class CountLetters {
        String s;

    public static HashMap<Character, Integer> letterCount(String s){
        HashMap<Character, Integer> letters = new HashMap<>();
        String ex = s.toLowerCase();


        for (int i = 0; i < ex.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (ex.charAt(j) == ex.charAt(i)){
                    count++;
                }
            }
            letters.put(ex.charAt(i), count);
        }

        return letters;
    }
//    public HashMap<Character, Integer> letterCount(String s){
//        String alphabet = "abcdefghijklmnopqrstuvwxyz";
//        HashMap<Character, Integer> letters = new HashMap<>();
//        String ex = s.toLowerCase();
//        for (int i = 0; i < alphabet.length(); i++) {
//            int count = 0;
//            for (int j = 0; j < s.length(); j++) {
//                if (ex.charAt(j) == alphabet.charAt(i)){
//                    count++;
//                }
//            }
//            letters.put(alphabet.charAt(i), count);
//        }
//
//        return letters;
//    }
}
