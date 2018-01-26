package com.study.pointer;

public class MaxArea {
  public static void main(String[] args) {

  }

  public static int maxArea(int[] height) {
    int max = -1;
    for (int lo = 0, hi = height.length - 1; lo <= hi; ) {
      max = Math.max(max, (hi - lo) * Math.min(height[lo], height[hi]));
      if (height[lo] < height[hi]) lo++;
      else hi--;
    }

    return max;
  }
}
