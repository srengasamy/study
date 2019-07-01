package dynamic;

public class IsSubsequence {
  public boolean isSubsequence(String s, String t) {
    int m = s.length();
    int n = t.length();
    boolean[][] aux = new boolean[m + 1][n + 1];
    for (int i = 0; i <= n; i++) {
      aux[0][i] = true;
    }
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (s.charAt(i - 1) == t.charAt(j - 1)) {
          aux[i][j] = true && aux[i - 1][j - 1];
        } else {
          aux[i][j] = aux[i][j - 1];
        }
      }
    }
    return aux[m][n];
  }

  public static void main(String[] args) {
    System.out.println(new IsSubsequence().isSubsequence("axc", "ahbgdc"));
  }
}
