package dynamic;

public class StoneGame {
  public boolean stoneGame(int[] piles) {
    int[][] val = new int[piles.length][piles.length];
    for (int k = 0; k < piles.length; k++) {
      for (int i = 0, j = k; j < piles.length; i++, j++) {
        int x = i + 2 <= j ? val[i + 2][j] : 0;
        int y = i + 1 <= j - 1 ? val[i + 1][j - 1] : 0;
        int z = i <= j - 2 ? val[i][j - 1] : 0;
        val[i][j] = Math.max(piles[i] + Math.min(x, y), piles[j] + Math.min(y, z));
      }
    }
    int result = val[0][piles.length - 1];
    int total = 0;
    for (int num : piles) {
      total += num;
    }
    return result > (total / 2);
  }

  public static void main(String[] args) {
    System.out.println(new StoneGame().stoneGame(new int[]{5, 3, 4, 5}));
  }
}
