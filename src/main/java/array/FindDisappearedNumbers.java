package array;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
  public static void main(String[] args) {
    System.out.println(new FindDisappearedNumbers().findDisappearedNumbers(new int[]{1, 2, 3}));
  }

  public List<Integer> findDisappearedNumbers(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int j = Math.abs(nums[i]) - 1;
      if (nums[j] > 0) {
        nums[j] = -nums[j];
      }
    }
    List<Integer> results = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        results.add(i + 1);
      }
    }
    return results;
  }
}
