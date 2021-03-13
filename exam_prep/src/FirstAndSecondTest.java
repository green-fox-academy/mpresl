import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndSecondTest {

  FirstAndSecondSmallest firstAndSecondSmallest;
  int arr[] = {5, 7, -8, 5, 14, 1};

  @Before
  public void setup() {
    firstAndSecondSmallest = new FirstAndSecondSmallest();
  }

  @Test
  public void methodShouldReturnFistAndSecondSmallestInt() {
    int[] nums = firstAndSecondSmallest.findSmallAndSecond(arr);
    assertEquals(nums[0], -8);
    assertEquals(nums[1],1 );
  }
}
