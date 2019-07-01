package string;

public class LongestPalindrome {

  public String longestPalindrome(String s) {
    int n = s.length();
    String result = "";
    boolean[][] aux = new boolean[n][n];
    for (int j = 0; j < n; j++) {
      for (int i = 0; i <=j; i++) {
        aux[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || aux[i + 1][j - 1]);
        if (aux[i][j] && (result.equals("") || j - i + 1 > result.length())) {
          result = s.substring(i, j+1);
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new LongestPalindrome().longestPalindrome("a"));
  }
}
