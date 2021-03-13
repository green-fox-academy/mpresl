import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeMatrixTest {

  TransposeMatrix transposeMatrix;

  @Before
  public void setup() {
    transposeMatrix = new TransposeMatrix();
  }
  @Test
  public void transpose() {
    Integer[][] original = new Integer[][] {
        {1,2,3},
        {4,5,6}
    };

    Integer[][] next = transposeMatrix.transpose(original);
    for (Integer[] n :
        next) {
      for (Integer x :
          n) {
        System.out.print(x);
      }
      System.out.println("");
    }
    Integer[][] get = new Integer[][] {
        {1,4},
        {2,5},
        {3,6}
    };
    assertArrayEquals(get, next);
  }
}