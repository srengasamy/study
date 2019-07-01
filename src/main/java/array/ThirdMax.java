package array;

import java.util.HashSet;
import java.util.Set;

public class ThirdMax {

  public static void main(String[] args) {
    System.out.println(new ThirdMax().thirdMax(new int[]{1, 2, -2147483648}));
  }

  public int thirdMax(int[] nums) {
    Integer a = null, b = null, c = null;
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    for (int num : set) {
      if (a == null || num > a) {
        c = b;
        b = a;
        a = num;
      } else if (b == null || num > b) {
        c = b;
        b = num;
      } else if (c == null || num > c) {
        c = num;
      }
    }
    return c != null ? c : Math.max(a, b);
  }
}
