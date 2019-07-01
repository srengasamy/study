package string;

public class IsInterleave {
  public boolean isInterleave(String s1, String s2, String s3) {
    boolean[][] aux = new boolean[s1.length() + 1][s2.length() + 1];
    for (int i = 0; i <= s1.length(); i++) {
      for (int j = 0; j <= s2.length(); j++) {
        if (i == 0 && j == 0) {
          aux[i][j] = true;
        } else if (i == 0) {
          aux[i][j] = aux[i][j - 1] && s3.charAt(i + j - 1) == s2.charAt(j - 1);
        } else if (j == 0) {
          aux[i][j] = s3.charAt(i + j - 1) == s1.charAt(i - 1) && aux[i - 1][j];
        } else {
          aux[i][j] = s1.charAt(i - 1) == s3.charAt(i + j - 1) && aux[i - 1][j] || s2.charAt(j - 1) == s3.charAt(i + j - 1) && aux[i][j - 1];
        }
      }
    }
    return aux[s1.length()][s2.length()];
  }

  public static void main(String[] args) {
    System.out.println(new IsInterleave().isInterleave("", "", "a"));
  }


}
