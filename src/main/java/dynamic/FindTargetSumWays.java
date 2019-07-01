package dynamic;

public class FindTargetSumWays {

  public int findTargetSumWays(int[] nums, int S) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    int[] dp = new int[2 * sum + 1];
    for (int i = 0; i < nums.length; i++) {
      int[] temp = new int[dp.length];
      for (int j = 0; j < dp.length; j++) {
        if (dp[j] != 0) {
          temp[j + nums[i]] += dp[j];
          temp[j - nums[i]] += dp[j];
        }
      }
      dp = temp;
    }
    return dp[sum + S];
  }

}
