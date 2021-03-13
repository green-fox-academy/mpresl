import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class LastWeekAlgos {

  public boolean checkAllnums(int[] nums) {
    int highest = Arrays.stream(nums).summaryStatistics().getMax();
    if (nums.length < highest) {
      return false;
    }
    int[] sorted = Arrays.stream(nums).sorted().distinct().toArray();
    for (int i = 0; i < highest; i++) {
      if (sorted[i] != i + 1) {
        return false;
      }
    }
    return true;
  }

  public List<Integer> pyramidSort(int[] array) {
    List<Integer> sorted = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
        int x = array[i];
        if (x%2 != 0) {
          sorted.add(x);
        }
      }
    for (int i = array.length -1; i >= 0; i--){
      int x = array[i];
      if (x%2 == 0) {
        sorted.add(x);
      }
    }

    return sorted;
  }

  public String replaceSpaces(String string) {
    return string.replaceAll(" ", "%20");
  }

  public String mostCommonWord (String string) {
    String[] words = string.toLowerCase().split(" ");
    HashMap<String, Integer> wordsAndCount = new HashMap<>();

    for (String s :
        words) {
      Integer count = 0;
      for (int i = 0; i < words.length; i++) {
        if (words[i].equals(s)) {
          count++;
        }
        wordsAndCount.put(s, count);
      }
    }
    int highest = 0;
    String mostCommon = "";
    for (Map.Entry<String, Integer> entry:
         wordsAndCount.entrySet()) {
      if (entry.getValue() > highest){
        highest = entry.getValue();
        mostCommon = entry.getKey();
      };
    }

    return mostCommon;
  }

  public int[][] rotateMatrix (int[][] matrix) {
    int n = matrix.length;

    for (int layer = 0; layer < n/2; layer++) {
      int first = layer;
      int last = n - 1 - layer;

      for (int i = first; i < last; i++) {
        int offset = i - first;

        int top = matrix[first][i]; //save top

        //left -> top
        matrix[first][i] = matrix[last-offset][first];
        //bottom -> left
        matrix[last-offset][first] = matrix[last][last-offset];
        //right -> bottom
        matrix[last][last-offset] = matrix[i][last];
        //top -> right
        matrix[i][last] = top; //right <- saved top
      }
    }

    return matrix;
  }

  public int searchString(String main, String term) {
    int size = term.length();
    int loc = -1;
    for (int i = 0; i < main.length() - size; i++) {
      if (main.substring(i, i+size).equals(term)) {
        loc = i;
      }
    }
    return loc;
  }

  public int searchArray(String term, String[] words) {
    int result = -1;
    for (int i = 0; i < words.length; i++) {
      if (words[i].toLowerCase().contains(term)) {
        return i;
      }
    }
    return result;
  }

  public List<String> makingMatches(List<String> girls, List<String> boys){
    List<String> mixed = new ArrayList<>();
    for (int i = 0; i < girls.size(); i++) {
        mixed.add(girls.get(i));
        mixed.add(boys.get(i));

    }
    if (girls.size() > boys.size()) {
      for (int i = boys.size(); i < girls.size(); i++) {
        mixed.add(girls.get(i));
      }
    } else if (boys.size() > girls.size()) {
      for (int i = girls.size(); i < boys.size(); i++) {
        mixed.add(boys.get(i));
      }
    }
    return mixed;
  }

  public int[] bubble (int[] nums) {
    return Arrays.stream(nums).sorted().toArray();
  }

  public int[] advancedBubble(int[] nums, boolean descending) {
    int[] sortedNums = Arrays.stream(nums).sorted().toArray();

    if (descending) {
      Integer[] desc = new Integer[sortedNums.length];
      for (int i = 0; i < sortedNums.length; i++) {
        desc[i] = sortedNums[i];
      }
      Collections.reverse(Arrays.asList(desc));
      int[] arr = new int[sortedNums.length];
      for (int i = 0; i < sortedNums.length; i++) {
        arr[i] = desc[i];
      }
      return arr;
    }
    return sortedNums;
  }

  public IntStream findUniqueItems(int[] nums) {
    return Arrays.stream(nums).distinct();
  }

  public List<Integer> findMatchingIndexes(int n, int[] nums) {
    List<Integer> indices = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == n){
        indices.add(i);
      }
      if (nums[i] > 10) {
        int x = nums[i] % 10;
        if (x == n) {
          indices.add(i);
        }
      }
    }
    indices.forEach(System.out::print);
    System.out.println();
    System.out.println(indices.toString());
    return indices;
  }
}
