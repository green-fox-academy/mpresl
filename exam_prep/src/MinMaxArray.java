import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxArray {

  public static void main(String[] args) {
    int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

    Object[] minMax = minAndMax(my_array);
    System.out.println(Arrays.toString(minAndMax(my_array)));
  }

  // public static int[] minMaxWithStream(int[] numbers) {
  //   int min = Arrays.stream(numbers).min().getAsInt();
  //   int max = Arrays.stream(numbers).max().getAsInt();
  // }

  public static Object[] minAndMax(int[] nums) {
    ArrayList minMax = new ArrayList();
    minMax.add(findMax(nums));
    minMax.add(findMin(nums));
    return minMax.toArray();
  }


  public static int findMax(int[] nums) {
    int max = 0;
    for (int n :
        nums) {
      if (n > max) {
        max = n;
      }
    }
    return max;
  }

  public static int findMin(int[] nums) {
    int min = nums[0];

    for (int n :
        nums) {
      if (n < min) {
        min = n;
      }
    }
    return min;
  }
}
