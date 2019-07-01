package dynamic;

public class CoinChange {
  public int coinChange(int[] coins, int amount) {
    int[] aux = new int[amount + 1];
    for (int i = 1; i <= amount; i++) {
      Integer max = Integer.MAX_VALUE;
      for (int c : coins) {
        if (c > i || aux[i - c] == Integer.MAX_VALUE) {
          continue;
        }
        max = Math.min(max, 1 + aux[i - c]);
      }
      aux[i] = max;
    }
    return aux[amount] == Integer.MAX_VALUE ? -1 : aux[amount];
  }

  public static void main(String[] args) {
    System.out.println(new CoinChange().coinChange(new int[]{2}, 3));
  }
}
