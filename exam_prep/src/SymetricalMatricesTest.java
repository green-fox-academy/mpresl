import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SymetricalMatricesTest {

  SymetricalMatrices symetricalMatrices;

  @Before
  public void setup(){
    symetricalMatrices = new SymetricalMatrices();
  }
  @Test
  public void checkSymmetry() {
    int[][] one = new int[][]{
        {1,0,1},
        {0,2,2},
        {1,2,5}
    };

    int[][] two = new int[][]{
        {7,7,7},
        {6,5,7},
        {1,2,1}
    };

    assertTrue(symetricalMatrices.checkSymmetry(one));
    assertFalse(symetricalMatrices.checkSymmetry(two));
  }
}