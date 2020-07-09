package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MathSumTest {
    MathSum mathSum;

    @BeforeEach
    public void setup(){
        mathSum = new MathSum();
        for (int i = 1; i < 6; i++) {
            mathSum.nums.add(i);
        }
    }
    @Test
    void sum() {
        assertEquals(15, mathSum.sum(mathSum.nums));
    }

    @Test
    void sumOneItem(){
        mathSum.nums.clear();
        mathSum.nums.add(5);
        assertEquals(mathSum.nums.get(0), mathSum.sum(mathSum.nums));
    }

    @Test
    void sumNull(){
        mathSum.nums.clear();
    assertNull(mathSum.nums);
    }
}