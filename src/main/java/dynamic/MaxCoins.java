package dynamic;

public class MaxCoins {
  public int maxCoins(int[] nums) {
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == Integer.MAX_VALUE) {
        continue;
      }
      int left = 1, right = 1;
      for (int j = i - 1; j >= 0 && nums[j] != Integer.MAX_VALUE; j--) {
        left = nums[j];
        break;
      }
      for (int j = i + 1; j < nums.length && nums[j] != Integer.MAX_VALUE; j++) {
        right = nums[j];
        break;
      }
      int center = nums[i];
      nums[i] = Integer.MAX_VALUE;
      max = Math.max(max, (left * center * right) + maxCoins(nums));
      nums[i] = center;
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println(new MaxCoins().maxCoins(new int[]{3, 1, 5, 8}));
  }

}
