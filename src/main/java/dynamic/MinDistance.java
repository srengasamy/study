package dynamic;

public class MinDistance {
  public int minDistance(String word1, String word2) {
    int m = word1.length();
    int n = word2.length();
    int[][] aux = new int[m + 1][n + 1];
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        if (i == 0 || j == 0) {
          aux[i][j] = i == 0 ? j : i;
        } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
          aux[i][j] = aux[i - 1][j - 1];
        } else {
          aux[i][j] = 1 + Math.min(Math.min(aux[i][j - 1], aux[i - 1][j - 1]), aux[i - 1][j]);
        }
      }
    }
    return aux[m][n];
  }

  public static void main(String[] args) {
    System.out.println(new MinDistance().minDistance("abc", "abc"));
  }
}
