package array;

public class RotateClockwise {

  public void rotate(int[][] matrix) {
    int n = matrix.length;
    for (int j = 0; j < n; j++) {
      for (int l = 0, r = n - 1; l < r; l++, r--) {
        int t = matrix[l][j];
        matrix[l][j] = matrix[r][j];
        matrix[r][j] = t;
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        int t = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = t;
      }
    }
  }

  public static void main(String[] args) {
    int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    new RotateClockwise().rotate(nums);
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        System.out.print(nums[i][j] + " ");
      }
      System.out.println();
    }
  }
}
