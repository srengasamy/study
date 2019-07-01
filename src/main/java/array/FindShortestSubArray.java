package array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray {
  public static void main(String[] args) {
    System.out.println(new FindShortestSubArray().findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));
  }

  public int findShortestSubArray(int[] nums) {
    Map<Integer, int[]> position = new HashMap<>();
    Map<Integer, Integer> count = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int c = count.containsKey(nums[i]) ? count.get(nums[i]) + 1 : 1;
      int[] p = position.containsKey(nums[i]) ? position.get(nums[i]) : new int[]{i, i};
      p[1] = i;
      count.put(nums[i], c);
      position.put(nums[i], p);
    }
    int degree = Collections.max(count.values());
    int result = Integer.MAX_VALUE;
    for (int num : nums) {
      if (count.get(num) == degree) {
        result = Math.min(result, position.get(num)[1] - position.get(num)[0] + 1);
      }
    }
    return result;
  }
}
