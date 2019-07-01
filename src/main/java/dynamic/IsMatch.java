package dynamic;

public class IsMatch {
  public boolean isMatch(String s, String p) {
    boolean[][] aux = new boolean[s.length() + 1][p.length() + 1];
    aux[0][0] = true;
    for (int j = 1; j < aux[0].length; j++) {
      if (p.charAt(j - 1) == '*') {
        if (aux[0][j - 1] || (j > 1 && aux[0][j - 2])) {
          aux[0][j] = true;
        }
      }
    }
    for (int i = 1; i < s.length(); i++) {
      for (int j = 1; j < p.length(); j++) {
        if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
          aux[i][j] = aux[i - 1][j - 1];
        }
        if (p.charAt(j - 1) == '*') {
          if (p.charAt(j - 2) != s.charAt(i - 1) && p.charAt(j - 2) != '.') {
            aux[i][j] = aux[i][j - 2];
          } else {
            aux[i][j] = aux[i - 1][j] || aux[i][j - 1] || aux[i][j - 2];
          }
        }
      }
    }
    return aux[s.length()][p.length()];
  }


  public static void main(String[] args) {
    System.out.println(new IsMatch().isMatch("aa", ".*"));
  }
}
