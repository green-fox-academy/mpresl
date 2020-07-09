package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
    CountLetters countLetters;

    @BeforeEach
    public void setUp(){
        countLetters = new CountLetters();
        countLetters.s = "Hello";
    }
    @Test
    void letterCount() {
        HashMap<Character, Integer> letters = new HashMap<>();
        letters = countLetters.letterCount(countLetters.s);
        int expected = 2;
        assertTrue(letters.containsValue(2));
        assertTrue(letters.containsKey('h'));
        assertFalse(letters.containsKey('m'));

    }
}