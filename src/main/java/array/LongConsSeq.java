package array;

import java.util.HashSet;
import java.util.Set;

public class LongConsSeq {
  public int seg(int[] nums) {
    if (nums.length == 0 || nums.length == 1) {
      return nums.length;
    }
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    int result = 0;
    for (int num : nums) {
      if (set.contains(num - 1)) {
        continue;
      }
      int len = 0;
      while (set.contains(num++)) {
        len++;
      }
      result = Math.max(result, len);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new LongConsSeq().seg(new int[]{100, 4, 200, 1, 3, 2}));
  }
}
