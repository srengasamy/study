package com.study.pointer;

import java.util.Arrays;

public class FindPairs {
  public static void main(String[] args) {
    int[] nums = {1, 1, 1, 1, 1};
    System.out.println(findPairs(nums, 0));
  }

  public static int findPairs(int[] nums, int k) {
    int result = 0;
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if (i != 0 && nums[i] == nums[i - 1]) continue;
      for (int j = i + 1; j < nums.length && nums[j] - nums[i] <= k; j++) {
        if (j != i + 1 && nums[j] == nums[j - 1]) continue;
        if (nums[j] - nums[i] == k) result++;
      }
    }
    return result;
  }
}
