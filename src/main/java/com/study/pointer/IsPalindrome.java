package com.study.pointer;

public class IsPalindrome {
  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    System.out.println(isPalindrome(s));
  }

  public static boolean isPalindrome(String s) {
    for (int lo = 0, hi = s.length() - 1; lo < hi; ) {
      if (!Character.isLetterOrDigit(s.charAt(lo))) lo++;
      else if (!Character.isLetterOrDigit(s.charAt(hi))) hi--;
      else if (Character.toLowerCase(s.charAt(lo++)) != Character.toLowerCase(s.charAt(hi--))) return false;
    }
    return true;
  }
}
