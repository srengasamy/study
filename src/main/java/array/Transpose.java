package array;

public class Transpose {
  public static void main(String[] args) {
    int[][] ans = new Transpose().transpose(new int[][]{{1, 2, 3}, {4, 5, 6}});
    System.out.println();
  }

  public int[][] transpose(int[][] A) {
    int[][] result = new int[A[0].length][A.length];
    for (int r = 0; r < A.length; r++) {
      for (int c = 0; c < A[r].length; c++) {
        result[c][r] = A[r][c];
      }
    }
    return result;
  }
}
