package dynamic;

public class CanPartition {
  public boolean canPartition(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    if (sum % 2 == 1) {
      return false;
    }
    int n = nums.length;
    sum = sum / 2;
    boolean[][] dp = new boolean[n + 1][sum + 1];
    for (int i = 0; i <= n; i++) {
      dp[i][0] = true;
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= sum; j++) {
        dp[i][j] = dp[i - 1][j];
        if (j >= nums[i - 1]) {
          dp[i][j] = (dp[i][j] || dp[i - 1][j - nums[i - 1]]);
        }
      }
    }
    return dp[n][sum];
  }

  public static void main(String[] args) {
    System.out.println(new CanPartition().canPartition(new int[]{1, 5, 11, 5}));
  }

}
