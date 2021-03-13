import java.util.Arrays;

public class FirstAndSecondSmallest {
  public int[] findSmallAndSecond(int[] numbers){
    int[] sorted = Arrays.stream(numbers).sorted().toArray();
    // ArrayList<Integer> oneAndTwo = new ArrayList<Integer>();
    // oneAndTwo.add(sorted[0]);
    // oneAndTwo.add(sorted[1]);
    //
    // int[] lowest = new int[2];
    // lowest[0] = sorted[0];
    // lowest[1] = sorted[1];

    return new int[] {sorted[0], sorted[1]};
  }
}
