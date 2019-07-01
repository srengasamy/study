package dynamic;

public class MaxSquareMatrix {
  public int maximalSquare(char[][] matrix) {
    if (matrix.length == 0) {
      return 0;
    }
    int max = 0;
    int[][] aux = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      aux[i][0] = matrix[i][0] == '1' ? 1 : 0;
    }
    for (int j = 0; j < matrix[0].length; j++) {
      aux[0][j] = matrix[0][j] == '1' ? 1 : 0;
    }
    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[i].length; j++) {
        if (matrix[i][j] == '1') {
          aux[i][j] = Math.min(aux[i - 1][j - 1], Math.min(aux[i - 1][j], aux[i][j - 1])) + 1;
          max = Math.max(max, aux[i][j]);
        }
      }
    }
    return max * max;
  }
}
