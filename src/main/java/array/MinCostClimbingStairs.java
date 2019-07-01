package array;

public class MinCostClimbingStairs {
  public static void main(String[] args) {
    System.out.println(new MinCostClimbingStairs().minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
  }

  public int minCostClimbingStairs(int[] cost) {
    int[] result = new int[cost.length + 1];
    for (int i = 2; i < result.length; i++) {
      result[i] = Math.min(result[i - 1] + cost[i - 1], result[i - 2] + cost[i - 2]);
    }
    return result[result.length - 1];
  }
}
