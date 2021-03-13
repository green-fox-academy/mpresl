public class GetAntiDiagonalAvg {
  public int getAntiDiagAvg(int[][] matrix) {
    int rows = matrix.length;
    int sum = 0;
    int count = 0;
    for (int i = rows-1; i >=0 ; i--) {
        sum += matrix[i][count];
        count++;
    }
    return sum/count;
  }
}
