import java.util.Arrays;
import java.util.stream.Stream;

public class CheckAnagram {
  public Boolean checkAnagram(String one, String two) {
    String[] letters1 = one.toLowerCase().split("");
    String[] letters2 = two.toLowerCase().split("");

    if (letters1.length != letters2.length){
      return false;
    }
    Arrays.sort(letters1);
    Arrays.sort(letters2);
    return Arrays.equals(letters1, letters2);
    }
}

