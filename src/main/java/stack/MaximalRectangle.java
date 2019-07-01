package stack;

public class MaximalRectangle {
  public int maximalRectangle(char[][] matrix) {
    int[][] result = new int[matrix.length][matrix[0].length];
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == '0') {
          continue;
        }
        result[i][j] = j == 0 ? 1 : result[i][j - 1] + 1;
        int min = result[i][j];
        for (int k = i; k >= 0; k--) {
          min = Math.min(min, result[k][j]);
          int area = (i - k + 1) * min;
          max = Math.max(max, area);
        }
      }
    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
    return max;
  }

  public static void main(String[] args) {
    char[][] matrix = {
            {'1', '0', '1', '1', '1'},
            {'0', '1', '0', '1', '0'},
            {'1', '1', '0', '1', '1'},
            {'1', '1', '0', '1', '1'},
            {'0', '1', '1', '1', '1'}};
    MaximalRectangle rectangle = new MaximalRectangle();
    System.out.println(rectangle.maximalRectangle(matrix));
  }
}
