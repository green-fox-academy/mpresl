import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElements {
  public List<Integer> removeDuplicates(Integer[] array) {
    List<Integer> sorted = new ArrayList();
    for (int i = 0; i < array.length; i++) {
      if (!sorted.contains(array[i])) {
        sorted.add(array[i]);
      }
    }
    return sorted;
  }

  public int[] uniqueEntries (int[] array) {
    return Arrays.stream(array).distinct().toArray();
  }
}
