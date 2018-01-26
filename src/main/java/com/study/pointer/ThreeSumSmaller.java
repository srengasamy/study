package com.study.pointer;

import java.util.Arrays;

public class ThreeSumSmaller {
  public static void main(String[] args) {
    int[] nums = {-2, 0, 1, 3};
    int target = 4;
    System.out.println(threeSumSmaller(nums, target));
  }

  public static int threeSumSmaller(int[] nums, int target) {
    int result = 0;
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      for (int l = i + 1, r = nums.length - 1; l < r; ) {
        int sum = nums[i] + nums[l] + nums[r];
        if (sum < target) {
          result += r - l;
          l++;
        } else r--;
      }
    }
    return result;

  }
}
