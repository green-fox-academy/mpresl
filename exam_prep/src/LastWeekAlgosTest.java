import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class LastWeekAlgosTest {

  LastWeekAlgos lastWeekAlgos;

  @Before
  public void setUp() {
    lastWeekAlgos = new LastWeekAlgos();
  }

  @Test
  public void findMatchingIndexes() {
    int[] numbers = new int[] {1, 11, 34, 52, 61};
    List<Integer> results = lastWeekAlgos.findMatchingIndexes(1,numbers);
    List<Integer> expected = Arrays.asList(0,1,4);
    assertEquals(expected, results);

    results = lastWeekAlgos.findMatchingIndexes(9,numbers);
    assertEquals(0, results.size());

  }

  @Test
  public void findUniqueItems() {
    IntStream results = lastWeekAlgos.findUniqueItems(new int[] {1, 11, 34, 11, 52, 61, 1, 34});
    assertEquals(5, results.count());
  }

  @Test
  public void bubble() {
    int[] results = lastWeekAlgos.bubble(new int[] {34, 12, 24, 9, 5});
    System.out.println(Arrays.toString(Arrays.stream(results).toArray()));
    int[] expected = new int[] {5, 9, 12, 24, 34};
    assertArrayEquals(expected, results);
  }

  @Test
  public void advancedBubble() {
    int[] results = lastWeekAlgos.advancedBubble(new int[] {34, 12, 24, 9, 5}, true);
    System.out.println(Arrays.toString(Arrays.stream(results).toArray()));

    int[] expected = new int[] {34, 24, 12, 9, 5};
    assertArrayEquals(expected, results);
  }

  @Test
  public void makingMatches() {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

    List<String> mixed = lastWeekAlgos.makingMatches(girls, boys);
    System.out.println(mixed.toString());
    assertEquals(11, mixed.size());
  }

  @Test
  public void searchArray() {
    String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
    int result = lastWeekAlgos.searchArray("chin", searchArr);
    assertEquals(4, result);
    result = lastWeekAlgos.searchArray("not", searchArr);
    assertEquals(-1, result);
  }

  @Test
  public void searchString() {
    assertEquals(17, lastWeekAlgos.searchString("this is what I'm searching in", "searching" ));
    assertEquals(-1, lastWeekAlgos.searchString("this is what I'm searching in", "not"));
  }

  @Test
  public void rotateMatrix() {
    int[][] matrix = new int[][] {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    lastWeekAlgos.rotateMatrix(matrix);
    for (int[] line :
        matrix) {
      System.out.println(Arrays.toString(line));
    }
    int[][] expected = new int[][] {
        {7,4,1},
        {8,5,2},
        {9,6,3}
    };
    assertArrayEquals(expected, matrix);
  }

  @Test
  public void mostCommonWord() {
    String result = lastWeekAlgos.mostCommonWord("The big boy went to the big store with his big dog");
    System.out.println(result);
    assertEquals("big", result);
  }

  @Test
  public void replaceSpaces() {
    String result = lastWeekAlgos.replaceSpaces("Mr John Smith");
    System.out.println(result);
  }

  @Test
  public void pyramidSort() {
    List<Integer> results = lastWeekAlgos.pyramidSort(new int[] {1,2,3,4,5,6,7});
    results.forEach(System.out::println);
  }

  @Test
  public void checkAllnums() {
    assertTrue(lastWeekAlgos.checkAllnums(new int[] {1,2,9,8,7,6,5,4,3,3,3}));
    assertTrue(lastWeekAlgos.checkAllnums(new int[] {4,1,3,2}));
    assertFalse(lastWeekAlgos.checkAllnums(new int[] {1,2,5,4}));
    assertFalse(lastWeekAlgos.checkAllnums(new int[] {1,2,4,2}));

  }
}