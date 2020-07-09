package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {
    Sharpie sharpie;

    @BeforeEach
    public void setUp(){
        sharpie = new Sharpie("green", 2);

    }
    @Test
    public void testUseInk(){
        sharpie.use();
        int expected = 90;
        assertEquals(expected, sharpie.inkAmount);
    }

}