package tests;

import java.util.Arrays;

public class Anagram {
    String sOne;
    String sTwo;


    public boolean AnagramCheck(String sOne, String sTwo){
        String[] letters1 = sOne.split("");
        String[] letters2 = sTwo.split("");
        if (letters1.length != letters2.length) {
            return false;
        }
        Arrays.sort(letters1);
        Arrays.sort(letters2);
        return Arrays.equals(letters1, letters2);

    }
}
