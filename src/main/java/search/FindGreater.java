package search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindGreater {
  public static void main(String[] args) {
    int[] nums = {4, 2, 5, 3, 1};
    Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      while (num > 0) {
        int pos = num & (-num);
        List<Integer> values = map.containsKey(pos) ? map.get(pos) : new ArrayList<Integer>();
        values.add(nums[i]);
        map.put(pos, values);
        num -= pos;
      }
    }
    System.out.println();
  }
}
