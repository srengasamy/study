package com.study.pointer;

public class StrStr {
  public static void main(String[] args) {
    System.out.println(strStr("mississippi", "pi"));
  }

  public static int strStr(String haystack, String needle) {
    if (haystack.equals(needle) || needle.equals("")) return 0;
    for (int i = 0; i < haystack.length(); i++) {
      if (haystack.charAt(i) != needle.charAt(0)) continue;
      int j = 0;
      while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) j++;
      if (j == needle.length()) return i;
    }
    return -1;
  }
}
