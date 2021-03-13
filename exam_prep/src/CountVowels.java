public class CountVowels {
  public int countVowels(String input) {
    String[] chars = input.toLowerCase().split("");
    int sum = 0;
    for (String s :
        chars) {
      if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
        sum++;
      }
    }
    return sum;
  }
}
