package dynamic;

public class MinCut {

  public static void main(String[] args) {
    System.out.println(new MinCut().minCut("aba"));
  }

  public int minCut(String s) {
    int n = s.length();
    boolean[][] aux = new boolean[n][n];
    int[] cuts = new int[n];
    for (int j = 0; j < n; j++) {
      cuts[j] = j;
      for (int i = 0; i <= j; i++) {
        if (s.charAt(i) == s.charAt(j) && (j - i < 3 || aux[i + 1][j - 1])) {
          aux[i][j] = true;
          cuts[j] = Math.min(cuts[j], i == 0 ? 0 : cuts[i - 1] + 1);
        }
      }
    }
    return cuts[n - 1];
  }
}
