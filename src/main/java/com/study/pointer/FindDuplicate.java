package com.study.pointer;

public class FindDuplicate {
  public static void main(String[] args) {
//    int[] nums = {1, 3, 4, 2, 2};
    int[] nums = {1, 1};
    System.out.println(findDuplicate(nums));
  }

  public static int findDuplicate(int[] nums) {
    int slow = nums[0];
    int fast = nums[nums[0]];
    while (slow != fast) {
      slow = nums[slow];
      fast = nums[nums[fast]];
    }
    slow = 0;
    while (fast != slow) {
      fast = nums[fast];
      slow = nums[slow];
    }
    return slow;
  }
}
