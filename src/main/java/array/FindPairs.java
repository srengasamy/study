package array;

import java.util.HashMap;
import java.util.Map;

public class FindPairs {

  public static void main(String[] args) {
    System.out.println(new FindPairs().findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    //1, 4
    //
  }

  public int findPairs(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    if (k == 0) {
      return (int) map.values().stream().filter(i -> i >= 2).count();
    }
    int ans = 0;
    for (int num : map.keySet()) {
      if (map.containsKey(num + k)) {
        ans++;
      }
    }
    return ans;
  }
}
