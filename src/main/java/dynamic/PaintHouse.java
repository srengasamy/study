package dynamic;

public class PaintHouse {

  public int minCost(int[][] costs) {
    if (costs == null || costs.length == 0) {
      return 0;
    }
    for (int i = costs.length - 2; i >= 0; i--) {
      costs[i][0] += Math.min(costs[i + 1][1], costs[i + 1][2]);
      costs[i][1] += Math.min(costs[i + 1][0], costs[i + 1][2]);
      costs[i][2] += Math.min(costs[i + 1][0], costs[i + 1][1]);
    }
    return Math.min(Math.min(costs[0][0], costs[0][1]), costs[0][2]);
  }

  public int cost(int[][] cost, int prev, int i, int n) {
    if (i >= n) {
      return 0;
    }
    int min = Integer.MAX_VALUE;
    for (int k = 0; k < cost[i].length; k++) {
      if (k == prev) {
        continue;
      }
      int localMin = cost[i][k] + cost(cost, k, i + 1, n);
      min = Math.min(min, localMin);
    }
    return min;
  }

  public static void main(String[] args) {
    int[][] values = {
            {17, 2, 17},
            {16, 16, 5},
            {14, 3, 19}
    };
    System.out.println(new PaintHouse().minCost(values));

  }
}
