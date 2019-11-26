package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

  public static void main(String[] args) {
    System.out.println(new FourSum().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 3));
  }

  public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length - 3; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      List<List<Integer>> sums = threeSum(nums, i + 1, target - nums[i]);
      for (List<Integer> sum : sums) {
        List<Integer> s = new ArrayList<>();
        s.add(nums[i]);
        s.addAll(sum);
        result.add(s);
      }
    }
    return result;
  }

  public List<List<Integer>> threeSum(int[] nums, int n, int target) {
    List<List<Integer>> result = new ArrayList<>();
    for (int i = n; i < nums.length - 2; i++) {
      if (i > n && nums[i] == nums[i - 1]) {
        continue;
      }
      for (int j = i + 1, k = nums.length - 1; j < k; ) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == target) {
          result.add(Arrays.asList(nums[i], nums[j], nums[k]));
          j++;
          k--;
          while (j < k && nums[j] == nums[j - 1]) {
            j++;
          }
          while (j < k && nums[k] == nums[k + 1]) {
            k--;
          }
        } else if (sum < target) {
          j++;
        } else {
          k--;
        }
      }
    }
    return result;
  }
}
