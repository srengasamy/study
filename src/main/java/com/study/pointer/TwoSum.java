package com.study.pointer;

public class TwoSum {

  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = twoSum(nums, target);
    System.out.println(result[0] + ", " + result[1]);
  }

  public static int[] twoSum(int[] nums, int target) {
    for (int lo = 0, hi = nums.length - 1; lo < hi; ) {
      if (lo != 0 && nums[lo] == nums[lo - 1]) lo++;
      if (nums[lo] + nums[hi] == target) return new int[]{lo + 1, hi + 1};
      else if (nums[lo] + nums[hi] < target) lo++;
      else hi--;
    }
    return new int[]{-1, -1};
  }
}
