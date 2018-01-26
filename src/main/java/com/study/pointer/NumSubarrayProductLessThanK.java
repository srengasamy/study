package com.study.pointer;

public class NumSubarrayProductLessThanK {
  public static void main(String[] args) {
    int[] nums = {2, 5, 6, 10};
    System.out.println(numSubarrayProductLessThanK(nums, 100));
  }

  public static int numSubarrayProductLessThanK(int[] nums, int target) {
    int result = 0;
    for (int l = 0, r = 0, product = 1; r < nums.length; r++) {
      product *= nums[r];
      while (l < r && product >= target) {
        product /= nums[l++];
      }
      if (product < target) result += (r - l) + 1;
    }
    return result;
  }
}
