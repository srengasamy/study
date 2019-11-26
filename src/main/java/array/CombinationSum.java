package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(candidates);
    sum(candidates, target, new ArrayList<>(), result, 0);
    return result;
  }

  public void sum(int[] candidates, int target, List<Integer> buffer, List<List<Integer>> result, int start) {
    if (target == 0) {
      result.add(new ArrayList<>(buffer));
    } else {
      for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
        buffer.add(candidates[i]);
        sum(candidates, target - candidates[i], buffer, result, i);
        buffer.remove(buffer.size() - 1);
      }
    }
  }


  public static void main(String[] args) {
    System.out.println(new CombinationSum().combinationSum(new int[]{2, 3, 6, 7}, 7));
  }
}
