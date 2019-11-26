package array;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
  public int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int sum = 0, count = 0;
    map.put(0, 1);
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (map.containsKey(sum - k)) {
        count += map.get(sum - k);
      }
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(new SubarraySum().subarraySum(new int[]{1, 1, 1}, 2));
  }
}
