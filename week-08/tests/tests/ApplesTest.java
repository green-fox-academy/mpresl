package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {
    Apples apple;
    @BeforeEach
    public void init(){
        apple = new Apples();
    }

    @Test
    void getApple() {
        String expected = "apple";
        assertEquals(expected, apple.getApple());
    }
}