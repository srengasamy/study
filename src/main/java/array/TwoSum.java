package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static void main(String[] args) {
    TwoSum twoSum = new TwoSum();
    int[] res = twoSum.twoSum(new int[]{-1, 0}, -1);
    System.out.println(res);
  }

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int remain = target - nums[i];
      if (map.containsKey(remain)) {
        return new int[]{map.get(remain), i + 1};
      }
      map.put(nums[i], i + 1);
    }
    return new int[0];
  }

}
