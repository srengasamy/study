package array;

public class IsToeplitzMatrix {
  public static void main(String[] args) {
    int[][] matrix = {
            {1, 2},
            {2, 1}
    };
    System.out.println(new IsToeplitzMatrix().isToeplitzMatrix(matrix));
  }

  public boolean isToeplitzMatrix(int[][] matrix) {
    for (int r = 0; r < matrix.length; r++) {
      for (int c = 0; c < matrix[r].length; c++) {
        if (r + 1 < matrix.length && c + 1 < matrix[r].length && matrix[r][c] != matrix[r + 1][c + 1]) {
          return false;
        }
      }
    }
    return true;
  }
}
