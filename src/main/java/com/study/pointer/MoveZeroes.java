package com.study.pointer;

public class MoveZeroes {
  public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    System.out.println(moveZeroes(nums));
  }

  public static int[] moveZeroes(int[] nums) {
    int p = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) nums[p++] = nums[i];
    }
    for (; p < nums.length; p++) nums[p] = 0;
    return nums;
  }
}
