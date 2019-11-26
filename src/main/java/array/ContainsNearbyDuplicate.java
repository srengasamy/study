package array;

import java.util.ArrayList;
import java.util.List;

public class ContainsNearbyDuplicate {
  public static void main(String[] args) {
    System.out.println(new ContainsNearbyDuplicate().containsNearbyDuplicate(new int[]{99, 99}, 1));
  }

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (list.contains(nums[i])) {
        return true;
      }
      list.add(nums[i]);
      if (list.size() > k) {
        list.remove(0);
      }
    }
    return false;
  }
}
