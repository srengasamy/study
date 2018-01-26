package com.study.pointer;

public class FindMaxConsecutiveOnes {
  public static void main(String[] args) {
    int[] nums = {1, 0, 1, 1, 0, 1, 1};
    System.out.println(findMaxConsecutiveOnes(nums));
  }

  public static int findMaxConsecutiveOnes(int[] nums) {
    int result = 0;
    for (int l = 0, r = 0, zeros = 0, allowed = 1; r < nums.length; r++) {
      if (nums[r] == 0) zeros++;
      while (zeros > allowed) if (nums[l++] == 0) zeros--;
      result = Math.max(result, r - l + 1);
    }
    return result;
  }
}
