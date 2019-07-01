package heap;

public class KthSmallest {
  public static void main(String[] args) {
    int[][] nums = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
    System.out.println(new KthSmallest().kthSmallest(nums, 8));
  }

  public int kthSmallest(int[][] matrix, int k) {
    int lo = matrix[0][0], hi = matrix[matrix.length - 1][matrix.length - 1];
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      int count = findCount(matrix, mid);
      if (count < k) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }
    return lo;
  }

  public int findCount(int[][] matrix, int value) {
    int r = matrix.length - 1, c = 0, count = 0;
    while (r >= 0 && c < matrix.length) {
      if (matrix[r][c] > value) {
        r--;
      } else {
        count += r + 1;
        c++;
      }
    }
    return count;
  }
}
