package array;

import java.util.ArrayList;
import java.util.List;

public class Permute {

  public static void main(String[] args) {
    System.out.println(new Permute().permute(new int[]{1, 2, 3}));
  }

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();
    permute(nums, results, new ArrayList<>());
    return results;
  }

  public void permute(int[] nums, List<List<Integer>> results, List<Integer> temp) {
    if (temp.size() == nums.length) {
      results.add(new ArrayList<>(temp));
    }
    for (int i = 0; i < nums.length; i++) {
      if (temp.contains(nums[i])) {
        continue;
      }
      temp.add(nums[i]);
      permute(nums, results, temp);
      temp.remove(temp.size() - 1);
    }
  }
}
