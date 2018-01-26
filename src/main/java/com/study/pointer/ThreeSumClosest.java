package com.study.pointer;

import java.util.Arrays;

public class ThreeSumClosest {
  public static void main(String[] args) {
    int[] nums = {-1, 2, 1, -4};
    System.out.println(threeSumClosest(nums, 1));
  }

  public static int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int minDiff = Integer.MAX_VALUE;
    int sum = 0;
    for (int i = 0; i < nums.length - 2; i++) {
      for (int lo = i + 1, hi = nums.length - 1; lo < hi; ) {
        int localSum = nums[i] + nums[lo] + nums[hi];
        if (localSum == target) return localSum;
        else if (localSum < target) lo++;
        else hi--;
        int diff = Math.abs(target - localSum);
        if (diff < minDiff) {
          minDiff = diff;
          sum = localSum;
        }
      }
    }
    return sum;
  }
}
