package com.study.pointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FourSum {

  public static void main(String[] args) {
    int[] nums = {-3, -2, -1, 0, 0, 1, 2, 3};
    System.out.println(fourSum(nums, 0));
  }

  public static List<List<Integer>> fourSum(int[] nums, int target) {
    Map<String, List<Integer>> result = new HashMap<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 3; i++) {
      for (int j = i + 1; j < nums.length - 2; j++) {
        for (int l = j + 1, r = nums.length - 1; l < r; ) {
          int sum = nums[i] + nums[j] + nums[l] + nums[r];
          if (sum == target) {
            String key = nums[i] + "|" + nums[j] + "|" + nums[l] + "|" + nums[r];
            if (!result.containsKey(key)) {
              result.put(key, Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
            }
            l++;
            r--;
          } else if (sum < target) l++;
          else r--;
        }
      }
    }
    return result.values().stream().collect(Collectors.toList());
  }
}
