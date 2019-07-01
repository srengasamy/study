package dynamic;

public class LongestPalindromeSubseq {
  public int longestPalindromeSubseq(String s) {
    int n = s.length();
    int[][] aux = new int[n][n];
    for (int i = 0; i < n; i++) {
      aux[i][i] = 1;
    }
    int result = Integer.MAX_VALUE;
    for (int k = 1; k <= n; k++) {
      for (int i = 0, j = k; j < n; i++, j++) {
        if (s.charAt(i) == s.charAt(j)) {
          aux[i][j] = 2 + (i + 1 <= j - 1 ? aux[i + 1][j - 1] : 0);
        } else {
          aux[i][j] = Math.max(aux[i + 1][j], aux[i][j - 1]);
        }
        result = Math.max(result, aux[i][j]);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new LongestPalindromeSubseq().longestPalindromeSubseq("a"));
  }
}
