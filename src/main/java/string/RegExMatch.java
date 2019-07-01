package string;

public class RegExMatch {

  public boolean match(String word, String pattern) {
    int m = pattern.length();
    int n = word.length();
    boolean[][] aux = new boolean[m + 1][n + 1];
    aux[0][0] = true;
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (pattern.charAt(i - 1) == '.') {
          aux[i][j] = aux[i - 1][j - 1];
        } else if (pattern.charAt(i - 1) == '*') {
          aux[i][j] = aux[i][j - 1] || aux[i - 1][j] || aux[i - 1][j - 1];
        } else {
          aux[i][j] = pattern.charAt(i - 1) == word.charAt(j - 1) && aux[i - 1][j - 1];
        }
      }
    }
    return aux[m][n];
  }

  public static void main(String[] args) {
    System.out.println(new RegExMatch().match("mississippi", "mis*is*p*."));
  }
}
