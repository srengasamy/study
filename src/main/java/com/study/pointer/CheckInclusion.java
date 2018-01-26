package com.study.pointer;

public class CheckInclusion {
  public static void main(String[] args) {
    String s1 = "adc";
    String s2 = "dcdcaa";
    System.out.println(checkInclusion(s1, s2));
  }

  public static boolean checkInclusion(String s1, String s2) {
    int[] need = new int[26];
    int[] found = new int[26];
    int len = 0;
    for (char c : s1.toCharArray()) need[c - 'a']++;
    for (int r = 0, l = 0; r < s2.length(); r++) {
      int pos = s2.charAt(r) - 'a';
      if (need[pos] == 0 || found[pos] == need[pos]) {
        while (l < r && (need[pos] == 0 ? true : found[pos] == need[pos])) {
          int p = s2.charAt(l++) - 'a';
          if (found[p] != 0) {
            found[p]--;
            len--;
          }
        }
        if (need[pos] == 0) continue;
      }
      found[pos]++;
      len++;
      if (len == s1.length()) return true;
    }
    return false;
  }
}
