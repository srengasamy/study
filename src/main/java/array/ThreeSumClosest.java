package array;

import java.util.Arrays;

public class ThreeSumClosest {
  public static void main(String[] args) {
    System.out.println(new ThreeSumClosest().threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
  }

  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int diff = Integer.MAX_VALUE;
    int result = 0;
    for (int i = 0; i < nums.length - 2; i++) {
      for (int j = i + 1, k = nums.length - 1; j < k; ) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == target) {
          return target;
        }
        int localDiff = Math.abs(target - sum);
      }
    }
    return result;
  }
}
