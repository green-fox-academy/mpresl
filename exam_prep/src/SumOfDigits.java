import java.util.ArrayList;
import java.util.List;

public class SumOfDigits {
  public static void main(String[] args) {
    // String myString = "1kjh234kjhkjh22 23542";
    //
    // System.out.println(getDigits(myString));

  }
  public int getDigits(String input) {
    String noLetters = input.replaceAll("[^0-9]+", "");
    String[] nums = noLetters.split("");
    int sum = 0;
    for (String s :
        nums) {
      int x = Integer.valueOf(s);
      sum += x;
    }

    return sum;
  }
}
