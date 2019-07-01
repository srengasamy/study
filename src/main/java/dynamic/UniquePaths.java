package dynamic;

public class UniquePaths {
  public int uniquePaths(int m, int n) {
    int[][] aux = new int[m][n];
    for (int i = 0; i < m; i++) {
      aux[i][0] = 1;
    }
    for (int j = 0; j < n; j++) {
      aux[0][j] = 1;
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        aux[i][j] = aux[i - 1][j] + aux[i][j - 1];
      }
    }
    return aux[m - 1][n - 1];
  }

  public static void main(String[] args) {
    System.out.println(new UniquePaths().uniquePaths(7, 3));
  }
}
