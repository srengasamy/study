package com.study.pointer;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("pwwkew"));
  }

  public static int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int max = 0;
    for (int l = 0, r = 0; r < s.length(); r++) {
      char c = s.charAt(r);
      int existing = map.getOrDefault(c, -1);
      if (existing != -1) {
        int t = l;
        while (t <= existing) map.remove(s.charAt(t++));
        l = t;
      }
      map.put(c, r);
      max = Math.max(max, (r - l) + 1);
    }
    return max;
  }
}
