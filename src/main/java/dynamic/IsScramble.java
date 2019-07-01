package dynamic;

public class IsScramble {

  public boolean isScramble(String s1, String s2) {
    if (s1 == null || s2 == null || s1.length() != s2.length()) return false;
    int n = s1.length();
    boolean[][][] aux = new boolean[n + 1][n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        aux[1][i][j] = s1.charAt(i) == s2.charAt(j);
      }
    }
    for (int k = 2; k <= n; k++) {
      for (int i = 0; i <= n - k; i++) {
        for (int j = 0; j <= n - k; j++) {
          for (int p = 1; p < k; p++) {
            aux[k][i][j] = (aux[p][i][j] && aux[k - p][i + p][j + p]) || (aux[p][i][j + p] && aux[k - p][i + p][j]);
          }
        }
      }
    }
    return aux[n][0][0];
  }

  public boolean is(String source, String scramble) {
    if (source.length() != scramble.length()) {
      return false;
    }
    if (source.equals(scramble)) {
      return true;
    }
    for (int i = 1; i < source.length(); i++) {
      String left = source.substring(0, i);
      String right = source.substring(i);
      String sLeft = scramble.substring(0, i);
      String sRight = scramble.substring(i);
      if (is(left, sLeft) && is(right, sRight)) {
        return true;
      }
      sLeft = scramble.substring(0, scramble.length() - i);
      sRight = scramble.substring(scramble.length() - i);
      if (is(left, sRight) && is(right, sLeft)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(new IsScramble().isScramble("great", "rgeat"));
  }
}
