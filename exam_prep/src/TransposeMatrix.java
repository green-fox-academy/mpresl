public class TransposeMatrix {
  public Integer[][] transpose(Integer[][] matrix) {
    int newRows = matrix[0].length;
    int newColumms = matrix.length;
    Integer[][] newMatrix = new Integer[newRows][newColumms];

    for (int i = 0; i < newRows; i++) {
      for (int j = 0; j < newColumms ; j++) {
        newMatrix[i][j] = matrix[j][i];
      }
    }
    return newMatrix;
  }
}
