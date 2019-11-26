package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(candidates);
    sum(candidates, target, new ArrayList<>(), result, 0);
    return result;
  }

  public void sum(int[] candidates, int target, List<Integer> buffer, List<List<Integer>> result, int start) {
    if (target == 0) {
      result.add(new ArrayList<>(buffer));
    } else {
      if (start >= candidates.length) {
        return;
      }
      for (int i = start; i < candidates.length && candidates[i] <= target; i++) {
        if (i > start && candidates[i] == candidates[i - 1]) {
          continue;
        }
        buffer.add(candidates[i]);
        sum(candidates, target - candidates[i], buffer, result, i + 1);
        buffer.remove(buffer.size() - 1);
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(new CombinationSum2().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
  }
}
