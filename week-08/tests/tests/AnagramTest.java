package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    Anagram anagram;

    @BeforeEach
    public void setUp(){
        anagram = new Anagram();
        anagram.sOne = "hello there";
        anagram.sTwo = "olleh ereth";
    }

    @Test
    void anagramCheck() {
        boolean result = anagram.AnagramCheck(anagram.sTwo, anagram.sOne);
        assertTrue(result);
    }
}