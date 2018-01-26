package com.study.pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
  public static void main(String[] args) {
    int[] nums = {0, 0, 0, 0};
    System.out.println(threeSum(nums));
  }

  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      if (i != 0 && nums[i] == nums[i - 1]) continue;
      for (int l = i + 1, r = nums.length - 1; l < r; ) {
        int sum = nums[i] + nums[l] + nums[r];
        if (sum == 0) {
          result.add(Arrays.asList(nums[i], nums[l], nums[r]));
          while (l + 1 < r && nums[l] == nums[l + 1]) l++;
          while (l < r - 1 && nums[r] == nums[r - 1]) r--;
          l++;
          r--;
        } else if (sum < 0) l++;
        else r--;
      }
    }
    return result;
  }
}
