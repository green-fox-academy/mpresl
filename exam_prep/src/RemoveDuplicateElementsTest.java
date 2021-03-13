import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveDuplicateElementsTest {

  RemoveDuplicateElements removeDuplicateElements;

  @Before
  public void setUp() throws Exception {
  removeDuplicateElements = new RemoveDuplicateElements();
  }

  @Test
  public void removeDuplicates() {
    Integer[] numbers = new Integer[]{1,2,3,3,4,4,5,6};

    List<Integer> nums = removeDuplicateElements.removeDuplicates(numbers);
    List<Integer> correct = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6});
    assertEquals(correct, nums);
  }

  @Test
  public void uniqueEntries() {
    int[] nums = new int[] {1,2,3,3,2,2,1,4,6,8,9,8,7,6,5,4,3,3,2,1};
    int[] results = removeDuplicateElements.uniqueEntries(nums);
    System.out.println(Arrays.stream(results).summaryStatistics());
    for (int x :
        results) {
      System.out.println(x);
    }
    assertEquals(9, results.length);
  }
}