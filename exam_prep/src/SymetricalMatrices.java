public class SymetricalMatrices {
  public Boolean checkSymmetry(int[][] one) {
    if (one.length != one[0].length) {
      return false;
    }
    for (int i = 0; i < one.length; i++) {
      for (int j = 0; j < one[0].length; j++) {
        if (i == j) {
          continue;
        }
        if (one[i][j] != one[j][i]) {
          return false;
        }
      }
    }
    return true;
  }
}
