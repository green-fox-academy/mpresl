import java.util.ArrayList;
import java.util.List;

public class TripleSum {
  public static void main(String[] args) {
    int arr[] = { 1, 6, 3, 0, 8, 4, 1, 7};

    findTriple(arr, 7);
  }

  public static List<int[]> findTriple(int[] arr, int sum) {
    List<int[]> listOfTriples = new ArrayList<>();

    for (int i = 0; i < arr.length - 2; i++) {
      for (int j = i + 1; j < arr.length - 1; j++) {
        for (int k = j + 1; k < arr.length - 1; k++) {
          if (arr[i] + arr[j] + arr[k] == sum) {
            listOfTriples.add(new int[]{arr[i], arr[j], arr[k]});
            System.out.println(arr[i]+", "+arr[j]+", " +arr[k]);
            };
          }
        }
      }

    return listOfTriples;
  }
}
