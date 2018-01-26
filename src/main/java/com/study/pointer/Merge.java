package com.study.pointer;

import java.util.Arrays;

public class Merge {
  public static void main(String[] args) {
    int[] nums1 = {1, 1, 3, 4, 0, 0, 0};
    int[] nums2 = {1, 8, 9};
    merge(nums1, 4, nums2, 3);
    Arrays.stream(nums1).forEach(c -> System.out.println(c));
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = nums1.length - 1;
    while (m > 0 && n > 0) {
      if (nums1[m - 1] > nums2[n - 1]) nums1[i--] = nums1[--m];
      else nums1[i--] = nums2[--n];
    }
    while (n > 0) nums1[i--] = nums2[--n];
  }
}
