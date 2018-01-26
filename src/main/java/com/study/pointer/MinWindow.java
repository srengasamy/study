package com.study.pointer;

public class MinWindow {
  public static void main(String[] args) {
    String s = "ADOBECODEBANCCBA";
    String t = "ABC";
    System.out.println(minWindow(s, t));
  }

  public static String minWindow(String s, String t) {
    int[] need = new int[256];
    int[] found = new int[256];
    int minLength = Integer.MAX_VALUE;
    String result = "";
    for (int i = 0; i < t.length(); i++) need[t.charAt(i)]++;
    for (int lo = 0, hi = 0, len = 0; hi < s.length(); hi++) {
      char c = s.charAt(hi);
      if (need[c] == 0) continue;
      found[c]++;
      if (need[c] >= found[c]) len++;
      if (len == t.length()) {
        for (char temp = s.charAt(lo); found[temp] == 0 || found[temp] > need[temp]; ) {
          if (found[temp] != 0) found[temp]--;
          temp = s.charAt(++lo);
        }
        if (hi - lo + 1 < minLength) {
          minLength = hi - lo + 1;
          result = s.substring(lo, hi + 1);
        }
      }
    }
    return result;
  }
}
