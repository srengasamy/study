package com.study.pointer;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstringTwoDistinct {
  public static void main(String[] args) {
    String s = "ececbaaaaaaa";
    System.out.println(lengthOfLongestSubstringTwoDistinct(s));
  }

  public static int lengthOfLongestSubstringTwoDistinct(String s) {
    int[] found = new int[256];
    Set<Character> counts = new HashSet<>();
    int result = Integer.MIN_VALUE;
    for (int l = 0, r = 0; r < s.length(); r++) {
      char c = s.charAt(r);
      found[c]++;
      counts.add(c);
      while (counts.size() > 2 && l < r) {
        c = s.charAt(l);
        found[c]--;
        if (found[c] == 0) counts.remove(c);
        l++;
      }
      result = Math.max(result, (r - l) + 1);
    }
    return result;
  }
}
