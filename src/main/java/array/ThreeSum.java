package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
  public static void main(String[] args) {
    System.out.println(new ThreeSum().threeSum(new int[]{0, 0, 0, 0}));
  }

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      for (int j = i + 1, k = nums.length - 1; j < k; ) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == 0) {
          results.add(Arrays.asList(nums[i], nums[j], nums[k]));
          j++;
          k--;
          while (j < k && nums[j] == nums[j - 1]) {
            j++;
          }
          while (j < k && nums[k] == nums[k + 1]) {
            k--;
          }
        } else if (sum < 0) {
          j++;
        } else {
          k--;
        }
      }
    }
    return results;
  }
}
