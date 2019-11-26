package array;

public class SearchMatrix {
  public boolean searchMatrix(int[][] matrix, int target) {
    int r = matrix.length, c = matrix[0].length;
    int i = r - 1, j = 0;
    while (i >= 0 && j < c) {
      if (matrix[i][j] == target) {
        return true;
      }
      if (matrix[i][j] < target) {
        j++;
      } else if (target < matrix[i][j]) {
        i--;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[][] nums = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
    };
    System.out.println(new SearchMatrix().searchMatrix(nums, 13));
  }
}
