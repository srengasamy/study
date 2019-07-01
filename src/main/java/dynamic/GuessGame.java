package dynamic;

public class GuessGame {
  public int getMoneyAmount(int n) {
    int[][] aux = new int[n + 2][n + 2];
    for (int k = 2; k <= n; k++) {
      for (int i = 1, j = k; j <= n; i++, j++) {
        int min = Integer.MAX_VALUE;
        for (int p = i; p <= j; p++) {
          int cost = Math.max(aux[i][p - 1], aux[p + 1][j]) + p;
          min = Math.min(min, cost);
        }
        aux[i][j] = min;
      }
    }
    return aux[1][n];
  }

  public int guess(int lo, int hi) {
    if (lo >= hi) {
      return 0;
    }

    int min = Integer.MAX_VALUE;
    for (int i = lo; i <= hi; i++) {
      int cost = i + Math.max(guess(lo, i - 1), guess(i + 1, hi));
      min = Math.min(min, cost);
    }
    return min;
  }

  public static void main(String[] args) {
    System.out.println(new GuessGame().getMoneyAmount(8));
  }
}
