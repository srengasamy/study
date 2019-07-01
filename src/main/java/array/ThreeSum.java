package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
  public static void main(String[] args) {
    System.out.println(new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
  }

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
        for (int j = i + 1, k = nums.length - 1; j < k; ) {
          int sum = nums[i] + nums[j] + nums[k];
          if (sum == 0) {
            results.add(Arrays.asList(nums[i], nums[j], nums[k]));
            break;
          } else if (sum < 0) {
            j++;
          } else {
            k--;
          }
        }
      }
    }
    return results;
  }
}
