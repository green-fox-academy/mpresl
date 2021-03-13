import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetAntiDiagonalAvgTest {

  GetAntiDiagonalAvg getAntiDiagonalAvg;

  @Before
  public void setUp() throws Exception {
  getAntiDiagonalAvg = new GetAntiDiagonalAvg();
  }

  @Test
  public void getAntiDiagAvg() {
    int[][] matrix = new int[][] {
        {1,2,3},
        {3,4,5},
        {5,2,5}
    };

    int[][] two = new int[][] {
        {1,2,3,4},
        {1,2,3,4},
        {1,2,3,4},
        {11,2,3,4}
    };
    assertEquals(4, getAntiDiagonalAvg.getAntiDiagAvg(matrix));
    assertEquals(5, getAntiDiagonalAvg.getAntiDiagAvg(two));
  }
}