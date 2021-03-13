public class CountingDuplicates {
  public static int duplicateCount(String text){
    int count = 0;
    String newText = text.toLowerCase();
    for (int i = 0; i < text.length(); i++) {
      int letterCount = 0;
      for (int j = 0; j < text.length(); j++) {
        if (newText.charAt(j) == newText.charAt(i)) {
          letterCount++;
        }
      }
      if (letterCount > 1) {
        count++;
      }
    }
    return count;
  }
}
