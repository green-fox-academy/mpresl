import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {
    PetRock rocky = new PetRock("Rocky");


    @Test
    public void getName() throws Exception {
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void testUnHappyToStart() throws Exception{
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay() {
    }
}