package com.study.pointer;

import java.util.Arrays;

public class SortColors {
  public static void main(String[] args) {
    int[] nums = {1, 0};
    sortColors(nums);
    Arrays.stream(nums).forEach(x -> System.out.println(x));
  }

  public static void sortColors(int[] nums) {
    for (int l = 0, m = 0, r = nums.length - 1; m <= r; ) {
      if (nums[m] == 1) m++;
      else if (nums[m] == 0) swap(nums, l++, m++);
      else swap(nums, m, r--);
    }
  }

  public static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
