package com.study.pointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};
    int[] result = intersection(nums1, nums2);
    Arrays.stream(result).forEach(x -> System.out.println(x));
  }

  public static int[] intersection(int[] nums1, int[] nums2) {
    if (nums1.length < nums2.length) {
      int[] temp = nums1;
      nums1 = nums2;
      nums2 = temp;
    }
    Arrays.sort(nums2);
    Set<Integer> result = new HashSet<>();
    for (int i = 0; i < nums1.length; i++) {
      for (int lo = 0, hi = nums2.length - 1; lo <= hi; ) {
        int mid = (lo + hi) / 2;
        if (nums2[mid] == nums1[i]) {
          result.add(nums1[i]);
          break;
        } else if (nums1[i] < nums2[mid]) hi = mid - 1;
        else lo = mid + 1;
      }
    }
    int j = 0;
    int[] inter = new int[result.size()];
    for (int i : result) inter[j++] = i;
    return inter;
  }
}
