import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MinMaxArrayTest {

  MinMaxArray minMaxArray;
  int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

  @Before
  public void setup() {
    minMaxArray = new MinMaxArray();
  }

  @Test
  public void methodShouldReturnMin() {
    assertEquals(14, minMaxArray.findMin(my_array));
  }

  @Test
  public void methodShouldReturnMax() {
    assertEquals(77, minMaxArray.findMax(my_array));
  }
}
