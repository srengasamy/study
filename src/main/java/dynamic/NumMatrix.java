package dynamic;

public class NumMatrix {
  final int[][] aux;

  public NumMatrix(int[][] matrix) {
    aux = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      int sum = 0;
      for (int j = 0; j < matrix[i].length; j++) {
        sum += matrix[i][j];
        aux[i][j] = sum;
      }
    }
    for (int j = 0; j < matrix[0].length; j++) {
      int sum = 0;
      for (int i = 0; i < matrix.length; i++) {
        sum += aux[i][j];
        aux[i][j] = sum;
      }
    }
  }

  public int sumRegion(int row1, int col1, int row2, int col2) {
    int total = aux[row2][col2];
    total -= (row1 == 0 ? 0 : aux[row1 - 1][col2]);
    total -= (col1 == 0 ? 0 : aux[row2][col1 - 1]);
    if (row1 != 0 || col1 != 0) {
      total += aux[row1 > 0 ? row1 - 1 : row1][col1 > 0 ? col1 - 1 : col1];
    }
    return total;
  }

  public static void main(String[] args) {
    int[][] matrix = {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
    };
    NumMatrix numMatrix = new NumMatrix(matrix);
    System.out.println(numMatrix.sumRegion(1, 2, 2, 4));
  }
}
