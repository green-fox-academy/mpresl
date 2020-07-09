package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
    Fibonacci fib;

    @BeforeEach
    public void setUp(){
        fib = new Fibonacci();

    }
    @Test
    void fibNum() {
        int expected = 1;
        assertEquals(expected, fib.fibNum(1));
    }

    @Test
    void zeroNum(){
        int expected = 0;
        assertEquals(expected, fib.fibNum(0));
    }

}