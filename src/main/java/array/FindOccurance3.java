package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOccurance3 {
  public int[] find(int[] nums) {
    Arrays.sort(nums);
    int last = -1;
    int count = 0;
    int n = nums.length / 3;
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (last != nums[i]) {
        if (count > n) {
          result.add(last);
        }
        last = nums[i];
        count = 1;
      } else {
        count++;
      }
      if (i == nums.length - 1 && count > n) {
        result.add(last);
      }
    }
    System.out.println(result);
    int[] res = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      res[i] = result.get(i);
    }
    return res;
  }

  public static void main(String[] args) {
    int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
    new FindOccurance3().find(nums);
  }
}
