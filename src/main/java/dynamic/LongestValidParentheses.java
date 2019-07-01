package dynamic;

public class LongestValidParentheses {

  public int longestValidParentheses(String s) {
    int n = s.length();
    boolean[][] aux = new boolean[n][n];
    int max = 0;
    for (int k = 1; k <= s.length(); k++) {
      for (int i = 0, j = k; j < s.length(); i++, j++) {
        if (s.charAt(i) == '(' && s.charAt(j) == ')' && (j - i < 2 || aux[i + 1][j - 1])) {
          aux[i][j] = true;
          max = Math.max(max, j - i + 1);
        } else {
          aux[i][j] = j - i > 1 ? aux[i + 1][j - 1] : false;
        }
      }
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println(new LongestValidParentheses().longestValidParentheses(")()())"));
  }
}
