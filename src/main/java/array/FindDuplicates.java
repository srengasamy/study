package array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
  public static void main(String[] args) {
    System.out.println(new FindDuplicates().findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
  }

  public List<Integer> findDuplicates(int[] nums) {
    int N = nums.length;
    int M = 2 * N;
    for (int i = 0; i < N; i++) {
      int val = nums[i] % M;
      nums[val - 1] += M;
    }
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      if (nums[i] / M > 1) {
        result.add(i + 1);
      }
    }
    return result;
  }
}
