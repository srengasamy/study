package com.study.pointer;

public class RemoveDuplicates {

  public static void main(String[] args) {
    int[] nums = {1, 1, 1, 2, 2, 2, 4};
    for (int i = 0; i < removeDuplicates(nums); i++) System.out.println(nums[i]);
  }

  public static int removeDuplicates(int[] nums) {
    int newLength = 0;
    for (int i = 1; i < nums.length; ) {
      if (nums[newLength] != nums[i]) nums[++newLength] = nums[i++];
      else i++;
    }
    return newLength + 1;
  }
}
