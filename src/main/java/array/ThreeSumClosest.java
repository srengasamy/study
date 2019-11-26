package array;

import java.util.Arrays;

public class ThreeSumClosest {
  public static void main(String[] args) {
    //-4, -1, 1, 2
    System.out.println(new ThreeSumClosest().threeSumClosest(new int[]{-1, 2, 1, -4}, -2));
  }

  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int result = 0, diff = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length - 2; i++) {
      for (int j = i + 1, k = nums.length - 1; j < k; ) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == target) {
          return target;
        } else if (sum < target) {
          j++;
        } else {
          k--;
        }
        int local = Math.abs(target - sum);
        if (diff > local) {
          diff = local;
          result = sum;
        }
      }
    }
    return result;
  }
}
