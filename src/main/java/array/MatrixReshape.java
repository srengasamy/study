package array;

public class MatrixReshape {
  public static void main(String[] args) {
    int[][] nums = {{1, 2}, {3, 4}};
    int[][] result = new MatrixReshape().matrixReshape(nums, 4, 1);
    System.out.println(result);
  }

  public int[][] matrixReshape(int[][] nums, int r, int c) {
    if (r * c != nums.length * nums[0].length) {
      return nums;
    }
    int[][] result = new int[r][c];
    r = 0;
    c = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        result[r][c] = nums[i][j];
        c++;
        if (c == result[0].length) {
          c = 0;
          r++;
        }
      }
    }
    return result;
  }
}
