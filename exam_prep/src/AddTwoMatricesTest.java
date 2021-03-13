import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoMatricesTest {

  AddTwoMatrices addTwoMatrices;

  @Before
  public void setup(){
    addTwoMatrices = new AddTwoMatrices();
  }
  @Test
  public void addMatrices() {
    Integer[][] one = new Integer[][] {
        {1,2,3},
        {1,2,3},
        {1,1,1}
    };
    Integer[][] two = new Integer[][] {
        {1,1,1},
        {2,2,2},
        {3,3,3}
    };
    Integer[][] result = addTwoMatrices.addMatrices(one, two);

    Integer[][] answer = new Integer[][]{
        {2,3,4},
        {3,4,5},
        {4,4,4}
    };

    assertArrayEquals(answer, result);
  }

  @Test
  public void multiplyMatrices() {
    Integer[][] one = {
        {1,2,3},
        {4,5,6}
    };
    Integer[][] two = {
        {7,8},
        {9,10},
        {11,12}
    };
    int[][] result = addTwoMatrices.multiplyMatrices(one, two);
    int[][] expected = new int[][] {
        {58,64},
        {139,154}
    };
    assertArrayEquals(expected, result);
  }
}