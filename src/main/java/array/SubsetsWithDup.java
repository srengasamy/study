package array;

import java.util.ArrayList;
import java.util.List;

public class SubsetsWithDup {

  public static void main(String[] args) {
    System.out.println(new SubsetsWithDup().subsetsWithDup(new int[]{1, 2, 2}));
  }

  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();
    subset(nums, results, new ArrayList<>(), 0);
    return results;
  }

  public void subset(int[] nums, List<List<Integer>> results, List<Integer> temp, int start) {
    results.add(new ArrayList<>(temp));
    for (int i = start; i < nums.length; i++) {
      if (i > start && nums[i] == nums[i - 1]) {
        continue;
      }
      temp.add(nums[i]);
      subset(nums, results, temp, i + 1);
      temp.remove(temp.size() - 1);
    }
  }
}
