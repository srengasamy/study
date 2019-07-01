package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
  public static void main(String[] args) {
    System.out.println(new TwoSum2().twoSum(new int[]{2, 7, 11, 15}, 9));
  }

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> sets = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (sets.containsKey(diff)) {
        return new int[]{sets.get(diff), i};
      }
      sets.put(nums[i], i);
    }
    return new int[0];
  }
}
