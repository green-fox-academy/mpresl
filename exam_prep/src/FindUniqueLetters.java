import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindUniqueLetters {

  public List<Character> findUniqueLetters(String s) {
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

    List<Character> unq = new ArrayList<>();
    for (Map.Entry<Character, Integer> current :
        letters.entrySet()) {
      if (current.getValue() == 1) {
        unq.add(current.getKey());
      }
    }
    return unq;
  }
}
