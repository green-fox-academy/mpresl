public class DiagonalArray {
    public static void main(String[] args) {

//        for (int i = 0; i < 4; i++) {
//            int[] row = new int[4];
//            row[i] = 1;
//            for (int element : row) {
//                System.out.print(element);
//            }
//            System.out.println();
//        }
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }

    }
}
