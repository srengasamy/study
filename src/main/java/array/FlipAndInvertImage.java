package array;

public class FlipAndInvertImage {
  public static void main(String[] args) {
    int[][] A = new FlipAndInvertImage().flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }

  public int[][] flipAndInvertImage(int[][] A) {
    for (int[] nums : A) {
      for (int i = 0, j = nums.length - 1; i <= j; i++, j--) {
        if (i == j) {
          nums[i] = (nums[i] + 1) % 2;
          continue;
        }
        if (nums[i] != nums[j]) {
          int t = nums[i];
          nums[i] = nums[j];
          nums[j] = t;
        }
        nums[i] = (nums[i] + 1) % 2;
        nums[j] = (nums[j] + 1) % 2;
      }
    }
    return A;
  }

}
