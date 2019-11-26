package array;

public class SetZeroes {

  public void setZeroes(int[][] matrix) {
    int R = matrix.length;
    int C = matrix[0].length;
    int root = matrix[0][0];
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }
    for (int i = 0; i < R; i++) {
      if (matrix[i][0] == 0) {
        for (int j = 0; j < C; j++) {
          matrix[i][j] = 0;
        }
      }
    }
    for (int j = 0; j < C; j++) {
      if (matrix[0][j] == 0) {
        for (int i = 0; i < R; i++) {
          matrix[i][j] = 0;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[][] nums = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}};

    new SetZeroes().setZeroes(nums);
    ;
  }
}
