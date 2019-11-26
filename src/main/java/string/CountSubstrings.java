package string;

public class CountSubstrings {
  public int countSubstrings(String s) {
    int n = s.length();
    int[][] aux = new int[n][n];
    for (int i = 0; i < n; i++) {
      aux[i][i] = 1;
    }
    for (int k = 1; k < n; k++) {
      for (int i = 0, j = k; j < n; i++, j++) {
        aux[i][j] = Math.max(aux[i + 1][j], aux[i][j - 1]) + 1;
        String word = s.substring(i, j+1);
        if (new StringBuffer(word).reverse().toString().equals(word)) {
          aux[i][j]++;
        }
      }
    }
    return aux[0][n - 1];
  }

  public static void main(String[] args) {
    System.out.println(new CountSubstrings().countSubstrings("aaa"));
  }
}
