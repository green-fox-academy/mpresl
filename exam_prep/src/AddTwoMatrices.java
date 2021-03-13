public class AddTwoMatrices {
  public Integer[][] addMatrices(Integer[][] matrixOne, Integer[][] matrixTwo) {
    int matrixRows = matrixOne.length;
    int matrixColumns = matrixOne[0].length;

    Integer[][] result = new Integer[matrixRows][matrixColumns];
    for (int i = 0; i < matrixRows; i++) {
      for (int j = 0; j < matrixColumns; j++) {
        result[i][j] = matrixOne[i][j] + matrixTwo[i][j];
      }
    }
    return result;
  }

  public int[][] multiplyMatrices(Integer[][] one, Integer[][] two) {
    int matrixRows = one.length;
    int matrixColumns = two[0].length;

    if (one[0].length != two.length) {
      System.out.println("Unable to Multiply");
      return null;
    }

    int[][] result = new int[matrixRows][matrixColumns];
    for (int i = 0; i < matrixRows; i++) {
      for (int j = 0; j < matrixColumns; j++) {
        for (int k = 0; k < two.length; k++) {
          result[i][j] += one[i][k] * two[k][j];
        }
      }
    }

    for (int i = 0; i < matrixRows; i++) {
      for (int j = 0; j < matrixColumns; j++) {
        System.out.print(result[i][j] + " ");
      }
        System.out.println();
    }
    return result;
  }
}
