package dynamic;

public class MaxProfit {
  public int maxProfit(int[] prices) {
    if (prices.length == 0) {
      return 0;
    }
    int[] max = new int[prices.length + 1];
    for (int i = prices.length - 1; i >= 0; i--) {
      max[i] = Math.max(prices[i], max[i + 1]);
    }
    int result = 0;
    for (int i = 0; i < prices.length - 1; i++) {
      if (prices[i] < max[i + 1]) {
        result = Math.max(result, max[i + 1] - prices[i]);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new MaxProfit().maxProfit(new int[]{7}));
  }
}
