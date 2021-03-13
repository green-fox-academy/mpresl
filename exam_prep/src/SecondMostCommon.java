import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SecondMostCommon {

  public static void main(String[] args) {
    String s = "kjskjflksjlksjlgaaaaragdfgbupowewrwksd";

    Map<Character, Integer> charMap = MostFrequentChars(s);
    System.out.println(findSecondMost((HashMap<Character, Integer>) charMap));

  }

  public static int findSecondMost(HashMap<Character, Integer> chars) {
    Map.Entry<Character, Integer> highestValue = null;
    Map.Entry<Character, Integer> secondHighestValue = null;
    Map<Character, Integer> charMap = chars;

    for (Map.Entry<Character, Integer> current :
          charMap.entrySet()) {
      if (highestValue == null || current.getValue().compareTo(highestValue.getValue()) > 0) {
        highestValue = current;
      }

    }
    return highestValue.getKey();



  }

  public static HashMap<Character, Integer> MostFrequentChars(String s) {
    HashMap<Character, Integer> letters = new HashMap<>();
    String string = s.toLowerCase();

    for (int i = 0; i < string.length(); i++) {
      int count = 0;
      for (int j = 0; j < string.length(); j++) {
        if (string.charAt(i) == string.charAt(j)){
          count++;
        }
        letters.put(string.charAt(i), count);
      }
    }
    return letters;
  }
}
