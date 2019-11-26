package array;

public class MaxProfit {
  public int maxProfit(int[] prices) {
    int min = Integer.MAX_VALUE, profit = 0, total = 0;
    for (int price : prices) {
      if (price < min) {
        total += profit;
        min = price;
        profit = 0;
      } else if (price - min > profit) {
        profit = price - min;
      }
    }
    return total;
  }

  public int maxProfit(int[] prices, int s) {
    int profit = 0;
    for (int i = s; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[i] < prices[j]) {
          profit = Math.max(profit, (prices[j] - prices[i]) + maxProfit(prices, j + 1));
        }
      }
    }
    return profit;
  }

  public static void main(String[] args) {
    System.out.println(new MaxProfit().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
  }
}
