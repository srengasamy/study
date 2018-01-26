package com.study.pointer;

public class MinSubArrayLen {
  public static void main(String[] args) {
    int[] nums = {2, 3, 1, 2, 4, 3,7};
    int s = 7;
    System.out.println(minSubArrayLen(s, nums));
  }

  public static int minSubArrayLen(int s, int[] nums) {
    int sum = 0;
    int length = Integer.MAX_VALUE;
    for (int l = 0, r = 0; r < nums.length; r++) {
      sum += nums[r];
      while (sum >= s) {
        length = Math.min(length, (r - l) + 1);
        sum -= nums[l++];
      }
    }
    return length == Integer.MAX_VALUE ? 0 : length;
  }
}
