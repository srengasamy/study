package array;

public class MaxUncrossedLines {
  public int maxUncrossedLines(int[] A, int[] B) {
    int[][] result = new int[A.length + 1][B.length + 1];
    for (int i = 1; i <= A.length; i++) {
      for (int j = 1; j <= B.length; j++) {
        if (A[i - 1] == B[j - 1]) {
          result[i][j] = 1 + result[i - 1][j - 1];
        } else {
          result[i][j] = Math.max(result[i - 1][j], result[i][j - 1]);
        }
      }
    }
    return result[A.length][B.length];
  }

  public static void main(String[] args) {
    System.out.println(new MaxUncrossedLines().maxUncrossedLines(new int[]{1, 3, 7, 1, 7, 5}, new int[]{1, 9, 2, 5, 1}));
  }
}
